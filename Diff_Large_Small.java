package Arrays;

import java.util.Collections;
import java.util.Set;

public class Diff_Large_Small {
	public static void main(String[] args) {
		int[] arr = {7,6,9,3,20,8};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		if(arr.length>1) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max-min);
		}

	}}


