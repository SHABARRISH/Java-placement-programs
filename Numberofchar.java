package psna;
import java.util.*;
public class Numberofchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		char[] c =s.toCharArray();
		int len = s.length();
		for(int i=0;i<len ;i++)
			
		{	if(c[i]!=1)
			{
			int count =1;
			for(int j=i+1;j<len;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					c[j]=(int)1;
				}
			}
			
		System.out.println(c[i]+" occurs "+count+" times");
			}
		}	
	}	
}
