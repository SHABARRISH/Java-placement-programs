//Linear Recursion
package psna;
public class Sumrecursion {
	static int sum(int n) {
		if(n==0)
			return 0;
		n= n+sum(n-1);
		return n;
	}
	public static void main(String[] args) {
		int n=2;
		int k=sum(n);
		System.out.print(k);
	}
}


 