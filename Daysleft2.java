package psna;
import java.util.*;
public class Daysleft2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int sum=0;
String s1= sc.next();
String x1[]=s1.split("/", 3);
int d = Integer.parseInt(x1[0]);
int m = Integer.parseInt(x1[1]);
int y = Integer.parseInt(x1[2]);
int m1[]= {31,28,31,30,31,30,31,31,30,31,30,31};
if((y%400==0 || (y%4==0 && y%100!=0)))
m1[1]=29;
for(int i=0;i<m-1;i++)
sum+=m1[i];
sum=sum+d;
if((y%400==0 || (y%4==0 && y%100!=0)))
System.out.println(366-sum);
else
System.out.println(365-sum);
}
}