package psna;
import java.util.Scanner;
public class Rightrotate {
		static int n=0;
		static void insert(int arr[]) {
			int key;
			key=arr[n-1];
			for(int i=n-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=key;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int num[]=new int[n];
			for(int i=0;i<n;i++) {
				num[i]=sc.nextInt();
			}
			int x=sc.nextInt();
			for(int i=0;i<x;i++) {
				insert(num);
			}
			for(int i=0;i<n;i++) {
				System.out.print(num[i]+" ");
			}
}

}
