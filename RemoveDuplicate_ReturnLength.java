package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate_ReturnLength {

	public static void main(String[] args) {
		int[] array_nums = {2,3,3,4,4,4,11,11,11,11};
		Set<Integer> sorted_set = new TreeSet<>();
		 Set<Integer> set=new HashSet<>();
	        for (int anArray : array_nums) {
	            if(set.add(anArray)) {
	            	
	            }
	               
	        }

	        System.out.println(set);
	        System.out.println(set.size());
	        
	        
	     

	}

}
