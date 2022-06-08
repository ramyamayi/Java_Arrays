package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEquals_GivenInteger {


	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] numbers = new int[6];
		    System.out.println("Please enter 6  numbers");
		    for (int i = 0; i < numbers.length; i++)
		    {
		        numbers[i] = input.nextInt();
		    }
		    System.out.println("Please enter target value");
		   int target= input.nextInt();
		    for(int i=0;i<numbers.length;i++) {
		    	int sum =0;
		    	for(int j=i;j<numbers.length;j++) {
		    		sum =sum+numbers[j];
		    		if(sum== target ) {
		    			System.out.println(Arrays.toString((Arrays.copyOfRange(numbers, i, j+1))));
		    		}
		    	}
		}
	}

}
