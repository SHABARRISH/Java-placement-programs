package psna;
import java.util.*;
public class Profit {
public static void main(String[] args) {
	int p[]= {7,1,5,3,2,4};
	int max=0;
	int i=0;
	int x=1;
	int n = p.length;
	while(i<n && x<n-i)
	{
		if(p[i+x]-p[i]>max)
		{
			max = p[i+x] - p[i];		
		}
		x++;
		if(x==n)
		{
			x=1;
			i++;
		}
	}
	System.out.println(max);
	
}
}
