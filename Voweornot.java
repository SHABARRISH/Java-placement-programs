package psna;
import java.util.*;
public class Voweornot
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(c=='a' || c=='A' || c=='e' || c=='E' || c=='I' || c=='i' || c=='o'||c=='O'||c=='u'||c=='U')
{
System.out.println("Is a Vowel ");
}
else
System.out.println("Not a Vowel");
}
}