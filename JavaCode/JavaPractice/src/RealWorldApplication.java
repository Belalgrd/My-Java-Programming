/*
 
Operators are fundamental tools in programming languages like Java, and they are immensely useful when making applications for several reasons:

Data Manipulation: Operators enable developers to manipulate data efficiently. Arithmetic operators (e.g., +, -, *, /) are used to perform mathematical calculations, logical operators (e.g., &&, ||, !) are used to make decisions based on conditions, and bitwise operators (e.g., &, |, ^) are used to manipulate individual bits within data.

Expressing Logic: Operators allow developers to express complex logic concisely and clearly. For example, comparison operators (e.g., ==, !=, <, >) are used to compare values and make decisions based on the comparison result. This helps in writing code that is easier to understand and maintain.

Control Flow: Operators play a crucial role in controlling the flow of execution within an application. Conditional operators, such as the ternary operator, enable developers to create conditional expressions, which determine which code blocks are executed based on certain conditions. This facilitates the implementation of branching logic in applications.

Overall, operators are indispensable tools in application development, enabling developers to manipulate data, express logic, control program flow, improve efficiency, adhere to standards, and abstract underlying computational concepts effectively.
 
 */
public class RealWorldApplication {

	public static void main(String[] args) {
		// Example: Using operators in a simple banking application

		double accountBalance = 1500.00;
		double withdrawalAmount = 200.00;
		double depositAmount = 500.00;

		// Using arithmetic operators to update account balance
		accountBalance = accountBalance - withdrawalAmount; // Withdrawal
		System.out.println("Account balance after withdrawal: $" + accountBalance);

		accountBalance = accountBalance + depositAmount; // Deposit
		System.out.println("Account balance after deposit: $" + accountBalance);

		// Using comparison operator to check if balance is sufficient for another withdrawal
		double anotherWithdrawal = 2000.00;
		boolean isSufficientFunds = accountBalance >= anotherWithdrawal ? true : false; // Ternary operator

		if (isSufficientFunds) {
			accountBalance = accountBalance - anotherWithdrawal;
			System.out.println("Withdrawal successful. New balance: $" + accountBalance);
		} else {
			System.out.println("Insufficient funds for withdrawal of $" + anotherWithdrawal);
		}

	}

}


