package psna;
import java.util.*;

public class Personwalks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int step =10 , x=0,y=0,z=n;
		for(int i=0; i<n && z!=0;i++)
		{
			if(z>=4)
			{
				x=x+step;
				y=y-(step+10);
				x=x-(step+20);
				y=y+(step+30);
				step+=40;
				z-=4;
			}
			else if(z==3)
			{
				x=x+step;
				y=y-(step+10);
				x=x-(step+20);
//				step+=30;
				z-=3;
			}
			else if(z==2)
			{
				x=x+step;
				y=y-(step+10);
//				step+=20;
				z-=2;
			}
			else
			{
				x =x+step;
//				step+=10;
				z-=1;
			}
			
		}
		System.out.println(x+" "+y);
	}

	
}

