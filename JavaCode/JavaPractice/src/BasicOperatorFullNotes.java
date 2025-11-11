Working with Basic Operators
Learning Objectives

After completing this module, associates should be able to:

Discuss the different categories of operators in Java.
Discuss the different operators in each category.
Successfully execute a Java program that demonstrates the usage of different Java operators.
Description
Operators
If we want to make programs that "do something," we're going to need to create instructions that manipulate values and return new ones. Programming operations can be thought of like a math equation such as 4 * 5 = 20. When programming, however, we can almost never assume that a value is known. Instead, we have to represent that equation as: int result = a * b; where a and b represent two unknown numbers. The symbols that we use to perform operations are called operators, and they use one or more expressions to perform a calculation and return a result.

There are several different operators in Java. We have already seen the assignment operator (=), which assigns a reference variable to a primitive value or object. This article explains many of the other operators in detail, some of which we will discuss below.

Increment and Decrement Operators
To increment or decrement integral values, we can use the common postfix operators: x++ and x--, where x is a byte, short, int, or long. A similar operator is the prefix increment or decrement: ++x and --x. The difference is that the prefix operator will change the value before the rest of the expression is evaluated, while the postfix operator changes the value after the entire expression is evaluated.

int a = 5;
int b = a++; // assign b=5, then increment a to 6
int c = ++a; // increment a to 7, then assign c=7
System.out.println(a); // 7
System.out.println(b); // 5
System.out.println(c); // 7
Logical Operators
Logical, or boolean, operators perform operations that return boolean results. There are a few logical operators you should be aware of: && is the logical AND operator - it compares two boolean values. If both are true, the expression becomes true. Otherwise, the expression becomes false.

The logical OR operator || compares two boolean values - if either of the values is true, the expression evaluates to true. Otherwise, the expression is false.

Finally, the logical NOT operator ! reverses the state of the boolean - so true becomes false and false becomes true.

We can combine logical operations like so:

boolean a = true;
boolean b = false;
if (!(a && b)) {
  System.out.println("a and b are NOT both true");
}
We use parentheses to prioritize the expression a && b, which returns false. We use the ! operator to reverse the false value to true. So the if statement's condition is true, and the print statement is executed.

Comparison Operators
Comparison operators in Java are used to compare two values and return a boolean result. They are commonly used in control flow statements like if, while, and for loops.

Here are the main comparison operators:

== (equal to): Checks if two values are equal.

Example: a == b (true if a is equal to b).
!= (not equal to): Checks if two values are not equal.

Example: a != b (true if a is not equal to b).
> (greater than): Checks if the left operand is greater than the right operand.

Example: a > b (true if a is greater than b).
< (less than): Checks if the left operand is less than the right operand.

Example: a < b (true if a is less than b).
>= (greater than or equal to): Checks if the left operand is greater than or equal to the right operand.

Example: a >= b (true if a is greater than or equal to b).
<= (less than or equal to): Checks if the left operand is less than or equal to the right operand.

Example: a <= b (true if a is less than or equal to b).
Ternary Operator
The ternary operator uses the following syntax: x = condition ? expr1 : expr2. If the condition is true, x is assigned the value of expr1; if the condition is false, expr2 is assigned.

boolean skyIsBlue = true;
boolean twoAndTwoIsFour = true;
boolean makesSense = (skyIsBlue && twoAndTwoIsFour) ? true : false;
Operator Precedence
The operators below are listed in order of precedence. The closer an operator is to the top of the table, the higher its precedence. Operators with higher precedence will be evaluated before operators with lower precedence.

When operators of equal precedence appear in the same line of code:

All binary operators, with the exception of assignment operators, are evaluated from left to right.
Assignment operators are evaluated from right to left.
Operators	Precedence
postfix	expr++ expr--
unary	++expr --expr +expr -expr ~ !
multiplicative	* / %
additive	+ -
shift	<< >> >>>
relational	< > <= >= instanceof
equality	== !=
bitwise	AND &
bitwise exclusive OR	^
bitwise inclusive OR	|
logical AND	&&
logical OR	||
ternary	? :
assignment	= += -= *= /= %= &= ^=
Real World Application

Operators are fundamental tools in programming languages like Java, and they are immensely useful when making applications for several reasons:

Data Manipulation: Operators enable developers to manipulate data efficiently. Arithmetic operators (e.g., +, -, *, /) are used to perform mathematical calculations, logical operators (e.g., &&, ||, !) are used to make decisions based on conditions, and bitwise operators (e.g., &, |, ^) are used to manipulate individual bits within data.

Expressing Logic: Operators allow developers to express complex logic concisely and clearly. For example, comparison operators (e.g., ==, !=, <, >) are used to compare values and make decisions based on the comparison result. This helps in writing code that is easier to understand and maintain.

Control Flow: Operators play a crucial role in controlling the flow of execution within an application. Conditional operators, such as the ternary operator, enable developers to create conditional expressions, which determine which code blocks are executed based on certain conditions. This facilitates the implementation of branching logic in applications.

Overall, operators are indispensable tools in application development, enabling developers to manipulate data, express logic, control program flow, improve efficiency, adhere to standards, and abstract underlying computational concepts effectively.

Implementation
Java Unary Operators
Java unary operators require only one operand. Unary operators are used to perform various operations such as:

incrementing/decrementing a value by one
negating an expression
inverting the value of a boolean
Java Unary Operator Example: ++ and --

public class OperatorExample {  
    public static void main(String args[]){  
        int x=10;  
        System.out.println(x++);//10 (11)  
        System.out.println(++x);//12  
        System.out.println(x--);//12 (11)  
        System.out.println(--x);//10  
    }
}  
Java Unary Operator Example: !

public class OperatorExample{  
    public static void main(String args[]){
        boolean c=true;  
        boolean d=false;  
        System.out.println(!c);//false (opposite of boolean value)  
        System.out.println(!d);//true  
    }
}  
Java Arithmetic Operators
Java arithmetic operators are used to perform addition, subtraction, multiplication, and division. They act as basic mathematical operations.

Java Arithmetic Operator Example

public class OperatorExample{  
    public static void main(String args[]){  
        int a=10;  
        int b=5;  
        System.out.println(a+b);//15  
        System.out.println(a-b);//5  
        System.out.println(a*b);//50  
        System.out.println(a/b);//2  
        System.out.println(a%b);//0  
    }
} 
Java AND Operator Example: Logical && and Bitwise &
The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.

The bitwise & operator always checks both conditions, whether the first condition is true or false.

public class OperatorExample{  
    public static void main(String args[]){  
        int a=10;  
        int b=5;  
        int c=20;  
        System.out.println(a<b&&a<c);//false && true = false  
        System.out.println(a<b&a<c);//false & true = false  
    }
}  
Java OR Operator Example: Logical || and Bitwise |
The logical || operator doesn't check the second condition if the first condition is true. It checks the second condition only if the first one is false.

The bitwise | operator always checks both conditions, whether the first condition is true or false.

public class OperatorExample{  
    public static void main(String args[]){  
        int a=10;  
        int b=5;  
        int c=20;  
        System.out.println(a>b||a<c);//true || true = true  
        System.out.println(a>b|a<c);//true | true = true  
        // || vs |  
        System.out.println(a>b||a++<c);//true || true = true  
        System.out.println(a);//10 because the second condition is not checked  
        System.out.println(a>b|a++<c);//true | true = true  
        System.out.println(a);//11 because the second condition is checked  
    }
} 
Java Ternary Operator
The Java ternary operator is used as a one-line replacement for the if-then-else statement and is used a lot in Java programming. It is the only conditional operator that takes three operands.

Java Ternary Operator Example

public class OperatorExample{  
    public static
void main(String args[]) {
int a = 2;
int b = 5;
int min = (a < b) ? a : b;
System.out.println(min);
}

Summary

There are different types of operators in Java:
Arithmetic operators (+, -, *, /, %)
Logical operators (&&, ||, !)
Comparison operators (>, <, ==, >=, <=, !=)
Assignment operators (=, +=, -=, *=, /=, %=)
Increment and decrement operators (++, --)
Ternary operators
Just like in arithmetic, there is an operator precedence that should be noted so that operations are conducted in the desired order.