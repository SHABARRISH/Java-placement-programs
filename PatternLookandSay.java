package psna;
import java.util.*;
public class PatternLookandSay {
	static String countAndSay(int n) {
        if(n==1) return "1";
        String t = countAndSay(n-1);
        int count = 1, len = t.length();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char c = t.charAt(i);
            if (i < len - 1 && t.charAt(i + 1) == c) count++;
            else {
                res.append(count).append(c);
                count = 1;
            }
        }
        return res.toString();
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		countAndSay(n);
		
	}

	}

