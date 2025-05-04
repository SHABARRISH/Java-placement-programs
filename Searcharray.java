package psna;
import java.util.*;

public class Searcharray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)

		{
			if(num[i]==x)
			{
				System.out.println("found");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("not found");
		}
		

}
}
