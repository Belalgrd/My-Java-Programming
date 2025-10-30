
public class OperatorPrecedence {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;

		// Without parentheses
		int result1 = a + b * c; // Multiplication has higher precedence than addition
		System.out.println("Result without parentheses: " + result1); // Outputs 155

		// With parentheses
		int result2 = (a + b) * c; // Parentheses change the order of operations
		System.out.println("Result with parentheses: " + result2); // Outputs 225

	}

}


/*

The operators below are listed in order of precedence. The closer an operator is to the top of the table, the higher its precedence. Operators with higher precedence will be evaluated before operators with lower precedence.

When operators of equal precedence appear in the same line of code:

All binary operators, with the exception of assignment operators, are evaluated from left to right.
Assignment operators are evaluated from right to left.

Operator Type	Operators
Postfix	() [] . ++ -- 
Unary	++ -- + - ~ !
Multiplicative	* / %
Additive	+ -
Shift	<< >> >>>
Relational	< <= > >= instanceof
Equality	== !=
Bitwise AND	&
Bitwise XOR	^
Bitwise OR	|
Logical AND	&&
Logical OR	||
Ternary	? :
Assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=
For example, in the expression a + b - c, both + and - have the same precedence level (additive), so the expression is evaluated from left to right: (a + b) - c.


*/
