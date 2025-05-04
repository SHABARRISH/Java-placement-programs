package psna;
import java.util.*;
public class Days {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int y=0,w=0,d=0;
	if(n>=365)
	{
		y=n/365;
		n=n-(y*365);
	}	
	if(n>=7)
	{
		w=n/7;
		n=n-(w*7);
	}
	d=n;
	System.out.println("Number of years :"+y);
	System.out.println("Number of weeks :"+w);
	System.out.println("Number of days :"+d);
}
}
