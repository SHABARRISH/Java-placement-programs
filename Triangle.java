package psna;

import java.util.Scanner;



public class Triangle {



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int x=sc.nextInt();

		int y=sc.nextInt();

		int z=sc.nextInt();

		if(x==y&&y==z)

			System.out.println("Equilateral");

		else if(x==y||x==z)

			System.out.println("Isosceles");

		else

			System.out.println("Scalene");

	}

}

