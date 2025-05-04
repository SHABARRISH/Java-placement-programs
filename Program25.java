package psna;
import java.util.*;

public class Program25 {
			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int count = 0;
			
			
			for (int i=2;i<=a;i++) {
				
				 {
					while(a%i==0)
					{
						count++;
						a=a/i;
					
					}
					if(count>0)
					{
						System.out.println(i+"->"+count);
						count = 0;
					}
				}
			
		}
}
}