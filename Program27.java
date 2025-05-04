package psna;
import java.util.*;
public class Program27 {
	public static void main(String[] args) {
		int i,count=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0||n==1)
		{
			System.out.println("not a prime");
		}
		else
		{
			for( i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
		}
		if(count!=0)
		{
			System.out.println("not a prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
}
