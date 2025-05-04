package psna;
import java.util.*;
public class Arrayinsert {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int  n = sc.nextInt();
		int arr[]= new int[n+1];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int p = sc.nextInt();
		for(int i=n;i>p-1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[p-1]=x;
		for(int i=0;i<n+1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
