package psna;
import java.sql.*;
import java.util.*;
import java.sql.Statement;

public class Proj
{
	static String dbUrl="jdbc:mysql://localhost:3306/psna";
    static String dbUname="root";
    static String dbPassword="";
    static String dbDriver="com.mysql.cj.jdbc.Driver";
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    try
   {
    Class.forName(dbDriver);
        }
   catch (ClassNotFoundException e2)
   {
    e2.printStackTrace();
}
  Connection con = null;
try
{
con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);
}
catch (SQLException e1)
{
e1.printStackTrace();
}
try
{
	System.out.println("1.Signup  2.Login");
	int t =sc.nextInt();
	while(t==1||t==2)
	{
	if(t==1)
	{
		System.out.println("Enter user name");
		String name = sc.next();
		System.out.println("Enter Email id");
		String Email = sc.next();
		System.out.println("Enter number");
		String num = sc.next();
		System.out.println("Enter DOB"); 
		String date = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();	
		String s1 ="insert into train(Name,email,Number,DOB,Password)"+"values('"+name+"','"+Email+"','"+num+"','"+date+"','"+pwd+"')";		
		Statement l = con.createStatement();
		l.execute(s1);
		System.out.println("signup successfull");
	} 
	else if(t==2)
	{
		System.out.println("Enter user name");
		String n1 = sc.next();
		System.out.println("Enter password");
		String p1 = sc.next();	
		Statement l = con.createStatement();
		ResultSet rs = l.executeQuery("SELECT * FROM train WHERE");
		while(rs.next())
		{
			String nc = rs.getString("Name");
            String ec = rs.getString("email");
            String numc = rs.getString("Number");
            String dc = rs.getString("DOB");
            String pwc = rs.getString("Password");
            if(p1.equals(pwc) && n1.equals(nc))
            {
            	System.out.println("Login Succesfull");
            	return;
            }
            else
            {
            	System.out.println("Signup first");
            	return;
            }
		}
	}
	System.out.println("1.signup 2.login 3.exit");
	 t = sc.nextInt();
	
		
	}
	
	 con.close();
}
catch (SQLException e)
{
	System.out.println("enter correct values");
}  
}

}
