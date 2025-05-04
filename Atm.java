package psna;
import java.util.*;

public class Atm {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int count=0;
	        int notes[]={500,100,50,20,10,5,2,1};
	        System.out.println("Total number of notes:");
	        for(int i=0;i<8;i++)
	        {
	            while(a-notes[i]>=0)
	            {
	                a=a-notes[i];
	                count++;
	            }
	            System.out.println(notes[i]+" : "+count);
	            count = 0;
	            
	        }
	       
	    }
	}


