package psna;
import java.sql.*;
import java.sql.Connection;
import java.util.*;
public class Jdbcsample 
{
static String dbUrl="jdbc:mysql://localhost:3306/psna";
    static String dbUname="root";
    static String dbPassword="";
    static String dbDriver="com.mysql.cj.jdbc.Driver";
    public static void main(String[] args)
    {
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
String sql1 = "select * from train ";
   PreparedStatement p1 = con.prepareStatement(sql1);
// Statement stmt = con.createStatement();
  ResultSet rs    = p1.executeQuery();
//   rs.next();
//   System.out.print(rs.getString(1));
  while (rs.next())
  {
    System.out.print(rs.getString("Name")+" ");
      System.out.println(rs.getString("email"));                                
  }
  con.close();
}
catch (SQLException e)
{
e.printStackTrace();
}  
}

}

