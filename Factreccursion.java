package psna;

public class Factreccursion {
	static int fact(int n) {
		if(n==0)
			return 1;
		n= n*fact(n-1);
		return n;
	}
	public static void main(String[] args) {
		int n=5;
		int k=fact(n);
		System.out.print(k);
	}

}
