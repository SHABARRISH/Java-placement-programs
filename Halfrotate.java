package psna;
import java.util.*;
public class Halfrotate {

	static void insert(int arr[],int n) {
		int key;
		key=arr[n-1];
		for(int i=n-1;i>n/2;i--) {
			arr[i]=arr[i-1];
		}
		arr[n/2]=key;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int t = sc.nextInt();
		while(t!=0)
		{
			insert(arr,n);
			t--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
}