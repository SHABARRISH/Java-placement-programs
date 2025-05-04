package psna;
import java.util.*;
public class Program22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("1");
		for (int i=2;i<=n/2;i++) {
			
			if(n%i==0)
				System.out.print(","+i);
			
		}
		System.out.print(","+n);
		
	}

}
