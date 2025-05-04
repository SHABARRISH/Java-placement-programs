package psna;
import java.util.*;
public class Quadrant {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int x = sc.nextInt();
	int y =  sc.nextInt();
	if(x>0&&y>0)
	{
		System.out.println("positive x-axis and positive y-axis");
	}
	else if(x>0&&y<0)
	{
		System.out.println("Positive x-axis and negatve y-axis");
	}
	else if(x<0&&y>0)
	{
		System.out.println("negative x-axis and positive y-axis");
	}
	else if(x<0&&y<0)
	{
		System.out.println("negative x-axis and negative y-axis");
	}
	else if(x<0&&y==0)
	{
		System.out.println("negative x-axis");
	}
	else if(x>0&&y==0)
	{
		System.out.println("positive x-axis");
	}
	else if(x==0&&y>0)
	{
		System.out.println("positive y-axis");
	}
	else if(x==0&&y<0)
	{
		System.out.println("negative y-axis");
	}
	else
	{
		System.out.println("orgin");
	}
	
	
			
}
}