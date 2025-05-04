package psna;
import java.util.*;

public class Program28 {
	public static void main(String[] args) {
		int sum = 0,sum1 = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i =1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				sum+=i;
			}
		
		}
		for (int i =1;i<=b/2;i++)
		{
			if(b%i==0)
			{
				sum1+=i;
			}
		
		}
		if(sum==b&&sum1==a)
			System.out.println("Amicable pair");
		else
			System.out.println("Not a amicable pair");
		
			
		
	}

}
