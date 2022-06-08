package Arrays;

public class Second_Smallest {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 56, 21, 25, 67, 5, 3 };
		int min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				second_min = min;
				min = arr[i];
			}

			if (min < arr[i] && arr[i] != second_min) {
				second_min = arr[i];
			}
		}
		System.out.println(second_min);

	}

}
