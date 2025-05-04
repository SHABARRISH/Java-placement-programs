package psna;
import java.util.*;
public class Harshadno
{
static int harshad(int n)
{
int s=0;
while(n!=0)
{
s=s+n%10;
n/=10;
}
return s;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%harshad(a)==0)
System.out.println("YES");
else
System.out.println("NO");
}
}

