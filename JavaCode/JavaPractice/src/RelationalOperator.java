
public class RelationalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		// Greater Than
		boolean greaterThan = a > b;
		System.out.println("Greater Than (a > b): " + greaterThan); // Output: true

		// Less Than
		boolean lessThan = a < b;
		System.out.println("Less Than (a < b): " + lessThan); // Output: false

		// Greater Than or Equal To
		boolean greaterThanOrEqualTo = a >= b;
		System.out.println("Greater Than or Equal To (a >= b): " + greaterThanOrEqualTo); // Output: true

		// Less Than or Equal To
		boolean lessThanOrEqualTo = a <= b;
		System.out.println("Less Than or Equal To (a <= b): " + lessThanOrEqualTo); // Output: false

		// Equal To
		boolean equalTo = a == b;
		System.out.println("Equal To (a == b): " + equalTo); // Output: false

		// Not Equal To
		boolean notEqualTo = a != b;
		System.out.println("Not Equal To (a != b): " + notEqualTo); // Output: true

	}

}
