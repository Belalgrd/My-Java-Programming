
public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 5;  // In binary: 0101
		int b = 3;  // In binary: 0011

		// Using bitwise AND operator (&)
		int andResult = a & b;  // Result: 0001 (1 in decimal)
		System.out.println("Bitwise AND of a and b: " + andResult);

		// Using bitwise OR operator (|)
		int orResult = a | b;   // Result: 0111 (7 in decimal)
		System.out.println("Bitwise OR of a and b: " + orResult);

		// Using bitwise XOR operator (^)
		int xorResult = a ^ b;  // Result: 0110 (6 in decimal)
		System.out.println("Bitwise XOR of a and b: " + xorResult);

		// Using bitwise NOT operator (~)
		int notResult = ~a;      // Result: ...11111010 (-6 in decimal, two's complement)
		System.out.println("Bitwise NOT of a: " + notResult);

	}

}
