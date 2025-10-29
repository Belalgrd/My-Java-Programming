
public class DECREMETALOPERATORS {

	public static void main(String[] args) {
		int a = 5;
		System.out.println("Initial value of a: " + a);

		// Post-decrement
		int postDecrement = a--;
		System.out.println("Post-decrement (a--): " + postDecrement);
		System.out.println("Value of a after post-decrement: " + a);

		// Pre-decrement
		int preDecrement = --a;
		System.out.println("Pre-decrement (--a): " + preDecrement);
		System.out.println("Value of a after pre-decrement: " + a);

	}

}
