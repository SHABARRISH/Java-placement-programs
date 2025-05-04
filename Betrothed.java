package psna;

import java.util.Scanner;

public class Betrothed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			sum = sum+i;
		}
		int sum1=0;

		for(int i=1;i<=p/2;i++)
		{
			if(p%i==0)
			sum1 = sum1+i;
		}
		if((sum==p+1)&&(sum1==n+1))
				{
					System.out.println("Betrothed");
				}
		else
			System.out.println("Not Betrothed");
}
}
