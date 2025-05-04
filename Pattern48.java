package psna;
import java.util.Scanner;

public class Pattern48
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int r=0;r<n;r=r+2){
			for(int c=0;c<=n;c++){   
				if(c!=0) {
					if(c>1)
						System.out.printf("*%02d",(n*r)+c);
					else
						System.out.printf("%02d",(n*r)+c);
				}
			}
			System.out.println();
		}
		if(n%2==0) {
			for(int r=n-1;r>0;r=r-2){
				for(int c=0;c<=n;c++){   
					if(c!=0) {
						if(c>1)
							System.out.printf("*%02d",(n*r)+c);
						else
							System.out.printf("%02d",(n*r)+c);
					}
				}
				System.out.println();
			}
		}
		else {
			for(int r=n-2;r>0;r=r-2){
				for(int c=0;c<=n;c++){   
					if(c!=0) {
						if(c>1)
							System.out.printf("*%02d",(n*r)+c);
						else
							System.out.printf("%02d",(n*r)+c);
					}
				}
				System.out.println();
			}
		}
	}
}