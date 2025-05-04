package psna;
import java.util.*;

public class Pattern49 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int r=1-n;r<=0;r++)
	{
	for(int c=1-n;c<=0;c++)
	{
	if(Math.abs(c)>Math.abs(r))
	System.out.print(Math.abs(c)+1);
	else
	System.out.print(Math.abs(r)+1);
	}
	System.out.println();
	}
	}

}
