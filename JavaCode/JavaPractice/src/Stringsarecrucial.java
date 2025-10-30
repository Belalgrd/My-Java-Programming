/*
Real World Application

Strings are crucial in Java for several reasons:

Text Handling: Strings are used to represent text data in Java. They allow developers to manipulate and process textual information, such as user input, file contents, messages, and more.

Immutable: Strings in Java are immutable, meaning their values cannot be changed once they are created. This immutability ensures that string values remain constant throughout the program, which is important for maintaining data integrity and consistency.

Standard Library Support: Java provides a rich set of methods and functionalities for working with strings through the java.lang.String class. These methods allow developers to perform various string operations, such as substring extraction, searching, replacement, conversion, and more, without having to implement them from scratch.

Interoperability: Strings play a crucial role in interacting with external systems and APIs. They are used for communication between Java programs and databases, web services, network protocols, user interfaces, and other software components.

Overall, strings are indispensable in Java programming due to their versatility, immutability, widespread usage, standard library support, interoperability, and role as a key component in Java APIs and libraries.
 */







/*
Demonstrating Various String Methods and Operations
toUpperCase() and toLowerCase()
We can utilize the toUpperCase() and toLowerCase() methods to return an uppercase/lowercase equivalent of an existing string.

String str = "Revature";

String uppercase = str.toUpperCase();  // value in the variable "uppercase" will be "REVATURE"

String lowercase = str.toLowerCase(); // value in the variable "lowercase" will be "revature"

charAt(int index)
We can utilize the charAt() method to return an individual character at an index.

NOTE: The first character of a String starts at index 0

String str = "Revature";

char c1 = str.charAt(2);  // value in the variable "c1" will be 'v'

char c2 = str.charAt(6); // value in the variable "c2" will be 'r'

concat(String s)
We can utilize the concat() method to combine two different Strings together.

String str1 = "Rev";
String str2 = "ature";

String newStr = str1.concat(str2); // value in the variable "newStr" will be "Revature"

equals(String s)
This method is utilized to check if two strings are equal. This method will return a boolean.

String str1 = "Apple";
String str2 = "apple";

boolean b = str1.equals(str2); // value in the variable "b" will be false because .equals is case-sensitive.

equalsIgnoreCase(String s)
This method is utilized to check if two strings are equal but is NOT case-sensitive. This method will return a boolean.

String str1 = "Apple";
String str2 = "apple";

boolean b = str1.equalsIgnoreCase(str2); // value in the variable "b" will be true because .equalsIgnoreCase is NOT case-sensitive.

length()
This method is utilized to find the length of a string.

String str = " Cheese ";

int len = str.length(); // value in the variable "len" will be 8 (characters do not have to be a letter. Spaces and other symbols count as a character as well).

replace(char old, char new)
This method is utilized to replace every instance of one character with another.

String str = "Bitter*black*coffee*sure*is*for*long*days";

String newStr = str.replace('*', ' '); // value in the variable "newStr" will be "Bitter black coffee sure is for long days."

trim()
This method is utilized to remove white space.

characters from the beginning and end of a string

String str = "      Revature      ";

String newStr = str.trim(); // value in the variable "newStr" will be "Revature"

indexOf(char c)
This method is used to retrieve the index of the first occurrence of a given character within a String, or -1 if it is not found.

char character = 'a';
String s1 = "potatoes";
String s2 = "vanilla";

s1.indexOf(character); // will return 3
s2.indexOf(character); // will return -1
String Concatenation
Concatenation is the process of combining two strings together using the + (plus) operator. You'll often see string concatenation when printing the output of a variable along with a sentence.

For example, say you have the following code snippet:

int x = 2;
String s = "The value of x is " + x;
The value of s after this snippet executes is "The value of x is 2". What happens internally is that the value of x is converted into a String, and its value is combined with the value of the string "The value of x is ".

Notice we left a space after "is" so that the value of s would not be "The value of x is2".

int x = 2;
int y = 3;
System.out.println("The sum of x and y is " + x + y); // The sum of x and y is 23
When combining concatenation with addition operations, we need to ensure that the addition operation is evaluated before concatenation. The above example shows that concatenation happened so that the numbers were just added to the end of the string.

int x = 2;
int y = 3;
System.out.println("The sum of x and y is " + (x + y)); // The sum of x and y is 5
In the above example, we see that by having the addition operation happen first, the sum is correctly calculated and then concatenated.

int x = 2;
int y = 3;
System.out.println(x + y + " is the sum of x and y"); // 5 is the sum of x and y
Because operations of the same precedence are read from left to right, if we put the addition before the String concatenation, we get the correct value.
 */



public class Stringsarecrucial {

	public static void main(String[] args) {
		String str = "  Hello, World!  ";

		// toUpperCase
		System.out.println("Uppercase: " + str.toUpperCase());

		// toLowerCase
		System.out.println("Lowercase: " + str.toLowerCase());

		// charAt
		System.out.println("Character at index 7: " + str.charAt(7));

		// concat
		String newStr = str.concat(" Welcome to Java.");
		System.out.println("Concatenated String: " + newStr);

		// equals
		String str2 = "  Hello, World!  ";
		System.out.println("str equals str2: " + str.equals(str2));

		// equalsIgnoreCase
		String str3 = "  hello, world!  ";
		System.out.println("str equalsIgnoreCase str3: " + str.equalsIgnoreCase(str3));

		// indexOf
		System.out.println("Index of 'W': " + str.indexOf('W'));

		// length
		System.out.println("Length of str: " + str.length());

		// replace
		String replacedStr = str.replace('o', '0');
		System.out.println("Replaced String: " + replacedStr);

		// trim
		System.out.println("Trimmed String: '" + str.trim() + "'");

	}

}
