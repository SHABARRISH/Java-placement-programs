package psna;
import java.util.*;
public class Pattern46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n;c++)
			{   
				if(r%2==0)
				System.out.printf("%02d ",(n*r)+c+1);
				else if(r%2!=0)
					System.out.printf("%02d ",(n*(r+1))-c);
			
			}
			System.out.println();
		}
		
	}

}
