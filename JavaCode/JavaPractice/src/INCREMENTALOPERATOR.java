
public class INCREMENTALOPERATOR {

	public static void main(String[] args) {
		int a = 5;
		System.out.println("Initial value of a: " + a);

		// Post-increment
		int postIncrement = a++;
		System.out.println("Post-increment (a++): " + postIncrement);
		System.out.println("Value of a after post-increment: " + a);

		// Pre-increment
		int preIncrement = ++a;
		System.out.println("Pre-increment (++a): " + preIncrement);
		System.out.println("Value of a after pre-increment: " + a);

	}

}
