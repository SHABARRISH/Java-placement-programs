package psna;
import java.util.*;


public class Frequency {
	static int count(int  n )
	{	
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x= count(n);
		int[]arr=new int[x];
		int c = 0;
		for(int i=0;i<x;i++)
		{
			arr[i]=n%10;
			n=n/10;
		}
		
		for(int i = 0;i<10;i++)
		{
			
			c=0;
			for(int j=0;j<x;j++)
			{
				if(i==arr[j])
				{
					c++;
				}
				
			}
			System.out.println(i+" occurs "+c+" times" );	
		}
		}
}