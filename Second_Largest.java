package Arrays;

import java.util.Set;
import java.util.TreeSet;

public class Second_Largest {

	public static void main(String[] args) {
		int[] arr = {23,45,56,21,25,67,5,3};
		int max        = Integer.MIN_VALUE;
	    int second_max = Integer.MIN_VALUE;
	 
	     for(int i = 0; i <arr.length; i++) {
	 
	         if(arr[i] > max) {
	              second_max = max;
	              max = arr[i]; 
	          }
	 
	          if(max > arr[i] && arr[i] > second_max) {
	               second_max=arr[i];
	           }
	      }
	     System.out.println(second_max);
	 
		

	}

}
