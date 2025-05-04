package psna;
import java.util.*;
public class Pattern7
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int r=0;r<n;r++)
{
for(int c=0;c<n;c++)
{
if(c==n/2 && r>0)
System.out.print(r);
else
System.out.print(n);
}
System.out.println();
}
}
}