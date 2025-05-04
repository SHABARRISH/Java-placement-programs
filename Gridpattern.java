package psna;


public class Gridpattern {
	public static void main(String[] args) {
		int n=9,y=n;
		int z =(2*n)-3;
		for(int r=0;r<n;r++)
		{
			int x =n;
			for (int c=0;c<=r;c++)
			{
				System.out.print(x--);
			}
			for(int c=0;c<z;c++)
			{
				System.out.print(y);
			}
			y--;
			z=z-2;
			for (int c=n-r;c<=n;c++)
			{
				if(c!=1)
				System.out.print(c);
			}
			System.out.println();
		}
		int w = 2;
		for(int r=1;r<n;r++)
		{
			int x=n;
			for(int c =r ;c<n;c++)
			{
				System.out.print(x--);
			}
			for(int c =0;c<=(2*w)-4;c++)
			{
				System.out.print(w);
			}
			
			for (int c=r+1;c<=n;c++)
			{
				System.out.print(c);
			}
			w++;
			System.out.println();
		}
	}
	

}
