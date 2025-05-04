package psna;
import java.util.*;
public class Romannumber2 {
	
	    static int romanToInt(String s) {
	        HashMap<Character,Integer> map = new HashMap<>();
	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);
	        int len = s.length();
	        int sum=0;
	        for(int i=len-1;i>=0;i--)
	        {
	            int num = map.get(s.charAt(i));
	            if(num*4>sum)
	            	sum = sum+num;
	            else
	            	sum = sum-num;	            
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			System.out.println(romanToInt(s));
		}
	}

