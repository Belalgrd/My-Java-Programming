import java.util.Arrays;

public class RotateAnArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		System.out.println(Arrays.toString(rotate(arr, k)));
}
	public static int[] rotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n; // k might be greater than n
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
		return nums;
	}
	public static void reverse(int[] arr, int start, int end) {
		while (start < end ) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}