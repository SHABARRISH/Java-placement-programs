package psna;
import java.util.Scanner;

public class BasicPay {

public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int ba=sc.nextInt();

		int h=sc.nextInt();

		int d=sc.nextInt();

		float hr=0,da=0,tot=0;

		if(ba<=10000) {

			hr=(float)((ba/100)*h);

			da=(float)((ba/100)*d);

			tot=ba+hr+da;

			System.out.println(tot);

		}

		else if(ba<=20000&&ba>10000) {

			hr=(float)((ba/100)*h);

			da=(float)((ba/100)*d);

			tot=ba+hr+da;

			System.out.println(tot);

		}

		else if(ba>20000) {

			hr=(float)((ba/100)*h);

			da=(float)((ba/100)*d);

			tot=ba+hr+da;

			System.out.println(tot);

		}

	}

}




