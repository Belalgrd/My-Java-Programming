class StringMethodsExample {
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


/*

Real World Application

Strings are crucial in Java for several reasons:

Text Handling: Strings are used to represent text data in Java. They allow developers to manipulate and process textual information, such as user input, file contents, messages, and more.

Immutable: Strings in Java are immutable, meaning their values cannot be changed once they are created. This immutability ensures that string values remain constant throughout the program, which is important for maintaining data integrity and consistency.

Standard Library Support: Java provides a rich set of methods and functionalities for working with strings through the java.lang.String class. These methods allow developers to perform various string operations, such as substring extraction, searching, replacement, conversion, and more, without having to implement them from scratch.

Interoperability: Strings play a crucial role in interacting with external systems and APIs. They are used for communication between Java programs and databases, web services, network protocols, user interfaces, and other software components.

Overall, strings are indispensable in Java programming due to their versatility, immutability, widespread usage, standard library support, interoperability, and role as a key component in Java APIs and libraries.

*/