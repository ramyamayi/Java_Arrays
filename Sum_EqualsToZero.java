package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_EqualsToZero {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] numbers = new int[6];
		    System.out.println("Please enter 6 positive and negative numbers");
		    for (int i = 0; i < numbers.length; i++)
		    {
		        numbers[i] = input.nextInt();
		    }
		   
		    for(int i=0;i<numbers.length;i++) {
		    	
		    	for(int j=i;j<numbers.length;j++) {
		    		
		    		if(numbers[i]+numbers[j]== 0 ) {
		    			System.out.println("[ "+numbers[i]+ ","+numbers[j]+" ]");
		    		}
		    	}
		}

	}
}
