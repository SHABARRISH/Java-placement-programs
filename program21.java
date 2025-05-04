package psna;
import java.util.*;

public class program21 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int c = a;
		int b = sc.nextInt();
		for(int i=1;i<b;i++) {
				 a=a*c;
				
		}
		
		System.out.print(a);
		}
}
