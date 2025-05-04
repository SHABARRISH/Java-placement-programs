package psna;
import java.util.*;
public class Rightshift
{
static int rsh(int n)
{
int count=0,x=n;
while(x!=0)
        {
            count++;
            x=x/10;
        }
int a=n/10;
int b=n%10;
return (b*(int)Math.pow(10, count-1))+a;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=sc.nextInt();
for(int i=0;i<c;i++)
{
n=rsh(n);
}
System.out.println(n);
}
}
