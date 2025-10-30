/*
 * This program demonstrates the use of unary operators in Java.
 * Unary operators are operators that operate on a single operand to produce a new value.
 * Common unary operators include:
 * - Unary plus (+)
 * - Unary minus (-)
 * - Increment (++)
 * - Decrement (--)
 * - Logical NOT (!)
 * - Bitwise NOT (~)
 */


public class JavaUnaryOperators {

	public static void main(String[] args) {
		int a = 5;
		int b = -a; // Unary minus
		int c = +a; // Unary plus

		System.out.println("Original value of a: " + a);
		System.out.println("Unary minus of a: " + b);
		System.out.println("Unary plus of a: " + c);

		// Increment operator
		int incrementedValue = ++a; // Pre-increment
		System.out.println("Pre-incremented value of a: " + incrementedValue);

		// Decrement operator
		int decrementedValue = --a; // Pre-decrement
		System.out.println("Pre-decremented value of a: " + decrementedValue);

		// Logical NOT operator
		boolean flag = true;
		boolean notFlag = !flag;
		System.out.println("Original flag: " + flag);
		System.out.println("Logical NOT of flag: " + notFlag);

		// Bitwise NOT operator
		int bitwiseNotValue = ~a;
		System.out.println("Bitwise NOT of a: " + bitwiseNotValue);

	}

}
