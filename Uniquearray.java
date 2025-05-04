package psna;
import java.util.*;

public class Uniquearray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n = sc.nextInt();
		int arr[]= new int[n+1];
		int flag=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			flag=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			System.out.print(arr[i]+" ");
			
		}
		if(flag==1)
			System.out.println("no unique elements");
	
		
	}
	


}
