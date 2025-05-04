package psna;
import java.util.*;
public class Differencebetweentime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2 =sc.next();
		String x1[]=s1.split(":", 3);
		String x2[]=s2.split(":", 3);
		int h1 = Integer.parseInt(x1[0]);
		int h2 = Integer.parseInt(x2[0]);
		int m1 = Integer.parseInt(x1[1]);
		int m2 = Integer.parseInt(x2[1]);
		int sec1 = Integer.parseInt(x1[2]);
		int sec2 = Integer.parseInt(x2[2]);
		int ans= ((h2-h1)*3600)+((m2-m1)*60)+(sec2-sec1);
		System.out.println(Math.abs(ans));
	}

}
