package psna;

import java.util.*;
public class Leftshift
{
static int lsh(int n)
{
int count=0,x=n;
while(x!=0)
        {
            count++;
            x=x/10;
        }
int a=n/(int)Math.pow(10, count-1);
int b=n%(int)Math.pow(10, count-1);
return (b*10)+a;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=sc.nextInt();
for(int i=0;i<c;i++)
{
n=lsh(n);
}
System.out.println(n);
}
}