package psna;
import java.util.*;
public class Trailingzeroes {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int c=0;
			int n = sc.nextInt();
			while(n>=5)
			{
				n=n/5;
				c=c+n;
				
			}
			System.out.println(c);
			
		}
}
