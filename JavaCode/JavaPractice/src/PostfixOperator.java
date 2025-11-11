
public class PostfixOperator {

	public static void main(String[] args) {
		int number = 10;
		System.out.println("Initial value: " + number); // Output: 10
		
		// Postfix increment
		System.out.println("Postfix Increment: " + (number++)); // Output: 10
		System.out.println("Value after Postfix Increment: " + number); // Output: 11
		
		// Postfix decrement
		System.out.println("Postfix Decrement: " + (number--)); // Output: 11
		System.out.println("Value after Postfix Decrement: " + number); // Output: 10

	}

}
