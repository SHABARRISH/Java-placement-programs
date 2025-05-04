package psna;
import java.util.*;
public class Uniquestring {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	char c[]=s.toCharArray();
	int len = c.length;
	int b[] = new int[len];
	int count =1;
	for(int i=0;i<len-1;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(c[i]==c[j]&&i!=j)
			{
				count++;
				b[j] = -1;
			}
			if(b[i]!=-1)
			{
				b[i] = count;
			}
	
		}
	}
	for(int i=0;i<len;i++)
	{
	//	if(b[i]==1)
			System.out.print(b[i]+" ");
	}
}
}
