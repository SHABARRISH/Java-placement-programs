package psna;
import java.util.*;
public class Nthsmallest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),min=0;

int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int pos=sc.nextInt();
if(pos>0 && pos<=n)
{
Arrays.sort(arr);
System.out.print(arr[pos-1]);
}
else
System.out.println("Out of range");
}
}
