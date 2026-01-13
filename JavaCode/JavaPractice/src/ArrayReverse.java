// First ↔ Last, Second ↔ Second-last, ...

public class ArrayReverse {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		reverse(arr, 0, arr.length - 1);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
	public static void reverse(int[] arr, int start, int end) {
		while (start < end ) {
			int temp = arr[start];
			arr[start] =  arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
