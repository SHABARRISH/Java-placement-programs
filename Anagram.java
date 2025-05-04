package psna;
import java.util.*;
public class Anagram {



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String str1=sc.next();

		String str2=sc.next();

		if(str1.length()==str2.length()) {

			char arr1[]=str1.toCharArray();

			char arr2[]=str2.toCharArray();

			Arrays.sort(arr1);

			Arrays.sort(arr2);

			for(int i=0;i<str1.length();i++) {

				if(arr1[i]!=arr2[i]) {

					System.out.println(str1+" and "+str2+" are Not Anagram");

					return;

				}

			}

			System.out.println(str1+" and "+str2+" are Anagram");

		}

		else

			System.out.println(str1+" and "+str2+" are Not Anagram");

	}

}