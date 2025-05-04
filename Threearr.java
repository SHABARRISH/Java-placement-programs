package psna;
import java.util.*;
public class Threearr
{
static void Unique(int a[],int b[],int c[],int a1,int b1,int c1)
{
for(int i=0;i<a1;i++)
{
for(int j=0;j<b1;j++)
{
if(a[i]==b[j])
{
for(int k=0;k<c1;k++)
{
if(b[j]==c[k])
System.out.print(c[k]+" ");
}
}
}
}
}
static void scan(int n,int arr[])
{
Scanner sc=new Scanner(System.in);
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a1=sc.nextInt();
int b1=sc.nextInt();
int c1=sc.nextInt();
int a[]=new int[a1];
int b[]=new int[b1];
int c[]=new int[c1];
scan(a1,a);
scan(b1,b);
scan(c1,c);
Unique(a,b,c,a1,b1,c1);
}
}