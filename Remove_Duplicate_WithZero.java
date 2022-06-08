package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Remove_Duplicate_WithZero {

	public static void main(String[] args) {
		int[] array_nums = {2,3,3,4,4,4,11,11,11,11};
		Set<Integer> sorted_set = new TreeSet<>();
		 Set<Integer> set=new HashSet<>();
	        for (int anArray : array_nums) {
	            set.add(anArray);
	        }
	        int[] a=new int[array_nums.length];
	        int i=0;
	        for (Integer s:set) {
	            a[i]=s;
	            i++;
	        }
		System.out.println(Arrays.toString(a));
	}

}
