package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray_Inpattern {

	public static void main(String[] args) {
int[] arr=  {4,6,3,5,8,2,1};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
int[] temp = new int[arr.length];
int large = arr.length-1;
int small = 0;
boolean flag = true;
for(int i =0; i<arr.length;i++) {

          if (flag)
              temp[i] = arr[large--];
          else
              temp[i] = arr[small++];

          flag = !flag;
      }
System.out.println(Arrays.toString(temp));
}
	}


