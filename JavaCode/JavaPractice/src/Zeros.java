// Move all Zeros to End of Array

public class Zeros {

	public static void main(String[] args) {
		int arr[] = {1, 2, 0, 3, 4, 0, 5, 0, 6, 7};
		moveZeros(arr);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
	public static void moveZeros(int[] arr) {
		int insertPos = 0;
		for (int num : arr) {
			if (num != 0) {
				arr[insertPos++] = num;
			}
		}
		while (insertPos < arr.length) {
			arr[insertPos++] = 0;
		}
	}

}
