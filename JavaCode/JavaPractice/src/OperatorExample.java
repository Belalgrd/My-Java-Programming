
public class OperatorExample {

	public static void main(String[] args) {
		double num1 = 10.5;
		double num2 = 4.5;
		
		// Arithmetic Operators
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		// Relational Operators
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		// Logical Operators
		boolean condition1 = true;
		boolean condition2 = false;
		System.out.println(condition1 && condition2);
		System.out.println(condition1 || condition2);
		System.out.println(!condition1);
		
		// Assignment Operators
		double result = num1;
		result += num2;
		System.out.println(result);
		result -= num2;
		System.out.println(result);
		result *= num2;
		System.out.println(result);
		result /= num2;
		System.out.println(result);
		result %= num2;
		System.out.println(result);
		
		// Increment and Decrement Operators
		int count = 5;
		System.out.println(count++);
		System.out.println(++count);
		System.out.println(count--);
		System.out.println(--count);
		
		// Ternary Operator
		int a = 10, b = 20;
		int max = (a > b) ? a : b;
		System.out.println(max);
		
		// Bitwise Operators
		int x = 5;  // 0101 in binary
		int y = 3;  // 0011 in binary
		System.out.println(x & y);  // AND
		System.out.println(x | y);  // OR
		System.out.println(x ^ y);  // XOR
		System.out.println(~x);     // NOT
		System.out.println(x << 1); // Left Shift
		System.out.println(x >> 1); // Right Shift
		System.out.println(x >>> 1); // Unsigned Right Shift
		
		
		// String Concatenation Operator
		String str1 = "Hello, ";
		String str2 = "World!";
		System.out.println(str1 + str2);
		
		// Unary Operators
		int unaryNum = 10;
		System.out.println(+unaryNum);
		System.out.println(-unaryNum);
		
	}

}
