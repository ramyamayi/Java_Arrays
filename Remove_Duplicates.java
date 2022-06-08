package Arrays;


import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {
public static void main(String[] args) {
	int[] arr= {1,3,5,7,4,3,6,5};
	Set<Integer> set = new HashSet<Integer>();
	
			for(int i=0; i<arr.length;i++) {
				set.add(arr[i]);
		}
			System.out.println(set);
	}
	
}

