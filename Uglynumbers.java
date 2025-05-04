package psna;
import java.util.*;

public class Uglynumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int ans=0;
		for(int i =2 ;i*i<=n;i++)
		{
			while(n%i==0)
			{
				ans = i;
				n=n/i;
			}
		}
		if(ans<=5)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		

	}

}
