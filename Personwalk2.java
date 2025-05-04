package psna;
import java.util.*;
public class Personwalk2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char d = sc.next().charAt(0);
		if(d=='T')
			System.out.println("(0,"+n+")");
		else if(d=='B')
			System.out.println("(0,-"+n+")");
}
}