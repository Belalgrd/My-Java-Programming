
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// Using ternary operator to find the maximum of two numbers
		int max = (a > b) ? a : b;

		System.out.println("The maximum value is: " + max);

	}

}

/*


The ternary operator uses the following syntax: x = condition ? expr1 : expr2. If the condition is true, x is assigned the value of expr1; if the condition is false, expr2 is assigned.

boolean skyIsBlue = true;
boolean twoAndTwoIsFour = true;
boolean makesSense = (skyIsBlue && twoAndTwoIsFour) ? true : false;


*/