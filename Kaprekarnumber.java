package psna;
import java.util.*;

public class Kaprekarnumber {
	public static void main(String[] args) {
		
	
	 Scanner scanner = new Scanner(System.in);
     
     int n = scanner.nextInt();
      boolean isCapricorn = false;
      
     int square = n * n;
     int temp = square;
     int contDigits =0;
     
     while (temp > 0)
     {
         contDigits++;
         temp /= 10;
     }
    
     for (int i = 1; i < contDigits; i++)
     {
         int divisor = (int) Math.pow(10, i);
         int quotient = square / divisor;
         int remainder = square % divisor;
         if (quotient + remainder == n)
         {
             isCapricorn = true;
         }
     }
     if (isCapricorn)
     {
         System.out.println("Capricorn/Kaprekar number");
     } else
     {
         System.out.println("Not Capricorn/Kaprekar number");
     }
 }
}

