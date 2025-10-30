
public class LogicalOperators {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		// Logical AND
		System.out.println("a AND b: " + (a && b)); // false

		// Logical OR
		System.out.println("a OR b: " + (a || b)); // true

		// Logical NOT
		System.out.println("NOT a: " + (!a)); // false
		System.out.println("NOT b: " + (!b)); // true

	}

}

/*

Logical, or boolean, operators perform operations that return boolean results. There are a few logical operators you should be aware of: && is the logical AND operator - it compares two boolean values. If both are true, the expression becomes true. Otherwise, the expression becomes false.

The logical OR operator || compares two boolean values - if either of the values is true, the expression evaluates to true. Otherwise, the expression is false.

Finally, the logical NOT operator ! reverses the state of the boolean - so true becomes false and false becomes true.

*/

