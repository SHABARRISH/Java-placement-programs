package psna;
import java.util.Scanner;



public class Isogram {



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String str=sc.next();

		char arr[]=str.toCharArray();

		for(int i=0;i<str.length();i++) {

			for(int j=i;j<str.length();j++) {

				if(arr[i]==arr[j]&&i!=j) {

					System.out.println("NOT ISOGRAM");

					return;

				}

			}

		}

		System.out.println("ISOGRAM");

	}



}