package psna;
import java.util.Scanner;



public class Numberofchar3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char a[]=str.toCharArray();
		int len=str.length();
		
		int count=0;
		for(int i=0;i<len;i++) {
		    int flag=1;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]&&i!=j) {	
					flag=0;
					break;
				}
			}
			if(flag==1)
				count++;
		}
		System.out.print(count);
	}
}
