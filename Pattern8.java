package psna;
import java.util.*;
public class Pattern8
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int r=0;r<n;r++)
{
int x=1;
for(int c=r+1;c>1 && r>0;c--)
{
System.out.print(c);
}
for(int c=0;c<n;c++)
{
if(c>=r)
System.out.print(x++);
}
System.out.println();
}
}
}
