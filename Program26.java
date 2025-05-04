package psna;

import java.util.Scanner;

public class Program26 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
				sum+=i;
		}
			if(sum==a)
				System.out.println("perfect number");
			else
				System.out.println("not a perfect number");
		}
	}


