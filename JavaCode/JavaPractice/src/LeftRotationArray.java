import java.util.Arrays;

public class LeftRotationArray {
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5, 6};
		int k = 2;
		System.out.println(Arrays.toString(leftRotate(nums, k)));
	}
	public static int[] leftRotate(int[] nums, int k) {
		int n = nums.length;
		k = k % n; // k might be greater than n
		reverse(nums, 0, n - 1); // reverse the whole array
		reverse(nums, 0, n - k - 1); // reverse first n-k elements
		reverse(nums, n - k, n - 1); // reverse last k elements
		return nums;
	}
	public static void reverse(int[] nums, int start, int end) {
		while (start < end ) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}