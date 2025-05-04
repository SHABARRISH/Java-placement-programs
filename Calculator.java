import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char op = sc.next().charAt(0);
		int p = sc.nextInt();
		switch(op)
		{
		case '+':
		{
			System.out.println(n+p);
			break;
		}
		case '-':
		{
			System.out.println(n-p);
			break;
		}
		case '*':
		{
			System.out.println(n*p);
			break;
		}
		
		case '/':
		{
			System.out.println(n/p);
			break;
		}
		
		
	}

}
}

