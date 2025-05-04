package psna;
import java.util.*;
public class Reversewords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		
		String regex = " ";
		String[]arr=s.split(regex);
		int size = arr.length;	
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
				
	}
}
