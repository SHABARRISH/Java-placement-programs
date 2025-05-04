package psna;
import java.util.Scanner;



public class Numberofchar4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char a[]=str.toCharArray();
		int len=str.length();
		int c=0;
		int b[]=new int[len];
		for(int i=0;i<len;i++) {
			int count=1;
			if(b[i]!=-1) {
				for(int j=i+1;j<len-1;j++) {
					if(a[i]==a[j]) {	
						count++;
						b[j]=-1;
					}
				}
				if(b[i]!=-1)
					b[i]=count;
			}
		}
		for(int i=0;i<len;i++) {
			if(b[i]!=-1)
				c++;
		}
		System.out.print(c);
		}
	}



 

