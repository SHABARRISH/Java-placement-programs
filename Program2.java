package psna;
import java.util.*;
public class Program2 {
		public static void main(String[] ar) {
			Scanner sc = new Scanner(System.in);
			int  n = sc.nextInt();
			if(n<=127) {
				char a = (char)n;
				System.out.println(a);
			}
			else
				System.out.println("invalid input");
		}
		

}
