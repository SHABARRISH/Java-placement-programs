package psna;
import java.util.*;

public class Problem44 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int t=(2*n)-1;
	for(int r=1;r<=n;r++)
	{
	int x=r;
	for(int c=1;c<=r;c++)
	{
	System.out.print(c);
	}
	for(int space=1;space<t;space++)
	System.out.print(" ");
	for(int c=1;c<=r;c++)
	{
	System.out.print(x--);
	}
	System.out.println();
	t-=2;
	}
	}
	}


