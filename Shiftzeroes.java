package psna;
import java.util.*;
public class Shiftzeroes {
	static int count =0,size;
	
	
	static void delete(int arr[],int size){
		for (int i=0;i<size;i++)
		{
			if(arr[i]==0)
			{
				for(int j =i;j<size-1;j++)
				{
					arr[j]=arr[j+1];
				}
				count++;
			}
			if(arr[i]==0)
				i--;
			if(i==size-1-count)
				break;
		}
		
	}
	static void insert(int arr[],int size){
		for(int i=size-1,j=0;j<count;i--,j++)
		{
			arr[i] = 0;
		}	
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	size = sc.nextInt();
	int []nums = new int[size];
	for(int i=0;i<size;i++) 
	{
		nums[i] = sc.nextInt();
		
	}
	delete(nums,size);
	insert(nums,size);
	for(int i=0;i<size;i++)
	{
		System.out.print(nums[i]);
	}
}
}
