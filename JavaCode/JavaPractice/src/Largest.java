// Largest element in an Array

public class Largest {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(largest(arr));
	}
	public static int largest(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

}
