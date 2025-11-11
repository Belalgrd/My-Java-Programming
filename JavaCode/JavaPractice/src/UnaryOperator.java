
public class UnaryOperator {

	public static void main(String[] args) {
		int number = 10;
		System.out.println("Initial value: " + number); // Output: 10
		
		// Unary plus
		int unaryPlus = +number;
		System.out.println("Unary Plus: " + unaryPlus); // Output: 10
		
		// Unary minus
		int unaryMinus = -number;
		System.out.println("Unary Minus: " + unaryMinus); // Output: -10
		
		// Logical NOT
		boolean flag = true;
		boolean logicalNot = !flag;
		System.out.println("Logical NOT: " + logicalNot); // Output: false

	}

}
