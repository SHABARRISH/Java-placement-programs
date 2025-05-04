package psna;

import java.util.Scanner;

public class Betrothedrange {
	static int factor(int n)
	{
	int sum=0;
	for(int i=1;i<=n/2;i++)
	{
	if(n%i==0)
	sum+=i;
	}
	return sum;
	}
	public static void main(String[] args)
	{
	int sum=0,sum1=0;
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	int b=sc.nextInt();
	        for(int i=a;i<=b;i++)
	        {
	        int x=factor(i)-1;
	       
	        if(factor(x)==i+1 && x!=i)
	        {
	        System.out.println(i+" "+x);
	        i=x+1;
	        }
	        }
	}

}
