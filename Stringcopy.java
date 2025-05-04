package psna;
import java.util.Scanner;



public class Stringcopy {

	static void strcpy(char a[],char b[]) {

		for(int i=0;i<a.length;i++) {

			b[i]=a[i];

		}

	}



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String str1=sc.next();

		char b[]=new char[str1.length()];

		strcpy(str1.toCharArray(),b);

		System.out.println(b);

		sc.close();

	}

}