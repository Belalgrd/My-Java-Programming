
public class BitwiseExclusiveOR {

	public static void main(String[] args) {
		int a = 5;  // In binary: 0101
		int b = 3;  // In binary: 0011

		// Using bitwise XOR operator (^)
		int xorResult = a ^ b;  // Result: 0110 (6 in decimal)
		System.out.println("Bitwise XOR of a and b: " + xorResult);

	}

}
