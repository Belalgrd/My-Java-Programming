
public class logicalAND {

	public static void main(String[] args) {
		int a = 5;  // In binary: 0101
		int b = 3;  // In binary: 0011

		// Using logical AND operator (&&)
		boolean andResult = (a > 2) && (b < 5); // true && true = true
		System.out.println("Logical AND of conditions: " + andResult);

	}

}
