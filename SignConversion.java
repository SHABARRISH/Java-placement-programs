package psna;

import java.util.Scanner;



public class SignConversion {

	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int a=(n<0)?(-1*n):n;

		System.out.println(a);

	}

}