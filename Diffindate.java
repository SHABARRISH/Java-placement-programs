package psna;
import java.util.Scanner;
public class Diffindate
{
		static boolean valid(int d,int m,int y) 
		{
			if(m>=1&&m<=12) 
			{
				if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&(0<d&&d<=31))
					return true;
				else if((d>=1&&d<=30)&&(m==4||m==6||m==9||m==11))
					return true;
				else if(d>=1&&d<=28&&m==2)
					return true;
				else if(d==29&&m==2&&(y%400==0||(y%4==0&&y%100==0)))
					return true;
				else
					return false;
			}
			else
				return false;
		}
	static boolean isleap(int y)
	{
		if((y%400==0 || (y%4==0 && y%100!=0)))
			return true;
		else
			return false;
	}
	static int remain(int d,int m,int y, int x) 
	{
		int sum=0;
		int m1[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isleap(y))
			m1[1]=29;
		for(int i=0;i<m-1;i++)
			sum+=m1[i];
		sum=sum+d;
		if(x==1)
			return sum;
		else
		{
			if((y%400==0 || (y%4==0 && y%100!=0)))
				return(366-sum);
			else
				return(365-sum);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		String s1= sc.next();
		String s2=sc.next();
		String x1[]=s1.split("/", 3);
		int d1 = Integer.parseInt(x1[0]);
		int m1 = Integer.parseInt(x1[1]);
		int y1 = Integer.parseInt(x1[2]);
		String x2[]=s2.split("/", 3);
		int d2 = Integer.parseInt(x2[0]);
		int m2 = Integer.parseInt(x2[1]);
		int y2 = Integer.parseInt(x2[2]);
		int rem = remain(d1,m1,y1,0); 
		int com = remain(d2,m2,y2,1);
		if(!valid(d1,m1,y1) || !valid(d2,m2,y2))
			System.out.println("Invalid");
		else
		{
			sum=rem+com;
			if(y1==y2)
			{
				if(isleap(y1))
					sum=366-sum;
				else
					sum=365-sum;
			}
			if(y2-y1>1)
			{
				for(int i=y1+1;i<y2;i++)
				{
					if(isleap(i))
						sum+=366;
					else
						sum+=365;
				}
			}
			System.out.println("difference between two dates is  "+Math.abs(sum));
		}
	}
}
