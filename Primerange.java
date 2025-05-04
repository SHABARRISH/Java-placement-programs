package psna;
import java.util.*;

public class Primerange {
	static boolean isPrime(int n)
    {
        for(int j=2;j*j<=n;j++)
        {
            if(n%j==0)
                return false;
        }
        return true;
    }
public static void main(String[] args)
{
int flag=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a==1)
a=2;
for(int i=a;i<=b;i++)
{
if(isPrime(i))
{
if(flag==0)
{
System.out.print(i);
flag=1;
}
else
System.out.print(","+i);
}
}
}
}
	