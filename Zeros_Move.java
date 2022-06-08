package Arrays;

import java.util.Arrays;

public class Zeros_Move {

	public static void main(String[] args) {
		int[] array_nums = {0,0,1,0,3,0,5,0,6};
		int k=0;
		for(int i=0; i<array_nums.length;i++) {
			if(array_nums[i]>0) {
				array_nums[k]= array_nums[i];
				array_nums[i]=0;
				k++;
			}
		}
		System.out.println(Arrays.toString(array_nums));

	}

}
