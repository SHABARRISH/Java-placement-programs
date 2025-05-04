package psna;

import java.util.Scanner;

public class Smallestnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int arr[]= new int[n];
		int min=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		min=arr[0];
		for(int i=1;i<n;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("Smallest number is "+min);
	}

}

