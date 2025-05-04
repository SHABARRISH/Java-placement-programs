package psna;
import java.util.*;
public class Perfectsquar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] sqr=new int[(n/2)+1];
		for(int i=1;i<n/2+1;i++)
		{
			sqr[i] = i*i;
		}
		
	}
}