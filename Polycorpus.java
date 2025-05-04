package psna;
import java.util.*;
public class Polycorpus {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int flag=1;
	int arr[] = {a,b,c};
	Arrays.sort(arr);
	int x = arr.length;
	int sum = arr[0];
	int count =0;
	for(int i=0;i<x&&(flag==1||flag==2);i++)
	{
		
		if(sum<=n)
		{
			while(sum<=n+arr[i])
			{

			sum =sum+ arr[i];
			count++;
			}
			}
		
		else
		{
			sum = arr[i]+arr[x-1];
			if(sum<=n)
			{
				count++;
			}
		}
		if(i==x) {
			i=0;
			flag++;
		}
	}
	System.out.print(count-1);
	

}
}
