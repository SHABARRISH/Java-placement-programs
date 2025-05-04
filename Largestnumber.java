package psna;
import java.util.*;
public class Largestnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int arr[]= new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		max=arr[0];
		for(int i=1;i<n;i++) 
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Largest number is "+max);
	}

}
