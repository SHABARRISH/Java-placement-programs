
package psna;
import java.util.*;

public class Swap {
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
		int p1 =sc.nextInt();
		int p2=sc.nextInt();
		int x = count(n);
		int j=0;
		int temp;
		int[]arr=new int[x];
		int[]arr1=new int[x];
		for(int i=0;i<x;i++)
		{
			arr[i]=n%10;
			n=n/10;
		}
		for(int i=x-1;i>=0;i--) {
			
			
				arr1[j]=arr[i];
				j++;	
		}
		temp=arr1[p1-1];
		arr1[p1-1]=arr1[p2-1];
		arr1[p2-1]=temp;
		for(int i=0;i<x;i++)
		{
			System.out.print(arr1[i]);
		}
		
	
}
}
