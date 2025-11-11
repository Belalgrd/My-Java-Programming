
public class ShiftOperator {

	public static void main(String[] args) {
		int a = 8; // Binary: 0000 1000

		// Left Shift
		int leftShift = a << 2; // Shifts bits to the left by 2 positions
		System.out.println("Left Shift (a << 2): " + leftShift); // Output: 32 (Binary: 0010 0000)

		// Right Shift
		int rightShift = a >> 2; // Shifts bits to the right by 2 positions
		System.out.println("Right Shift (a >> 2): " + rightShift); // Output: 2 (Binary: 0000 0010)

		// Unsigned Right Shift
		int unsignedRightShift = a >>> 2; // Shifts bits to the right by 2 positions, filling with zeros
		System.out.println("Unsigned Right Shift (a >>> 2): " + unsignedRightShift); // Output: 2 (Binary: 0000 0010)

	}

}
