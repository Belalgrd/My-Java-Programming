/*
 * 
 * Unique Properties of Strings in Java
Strings are very crucial in Java and are frequently used by Java programmers. It is important that Java developers have a good knowledge of the String class in order to use them effectively. In this article, we will focus on some of the important topics about Java String.

Strings do not use any null character for termination.
Strings do not use any null character for termination. On the contrary, strings and objects are backed by a character array. Programmers can use the character array to represent a String in the Java programming language. They can do this by using the toCharArray() method of the java.lang.String class of JDK.

Strings are not modifiable
One thing Java programmers must be aware of is that Strings are immutable, which means that once a programmer creates a String, it cannot be modified. If the programmer tries to modify the content of the String, it will create a new String. In other words, Strings do not allow the inclusion of new content into the existing String, and they also cannot override the functionality of a String.

Strings are placed in the String Pool
Strings are maintained in a separate String pool. The String pool is a special memory location available inside Java memory. Whenever a programmer creates a String object using a String literal, the Java Virtual Machine first checks the String pool, and if the JVM finds any similar content available in the String pool, it will return that string and not create a new object. The Java Virtual Machine does not check the String pool if the programmer creates an object using the new operator.

Comparison of Strings is done using the equals method
For comparing two Strings, the String class uses the equals() method instead of the equality operator. When comparing objects, the equality operator is used to check whether the values within the reference variables are the same.
Reference variables store memory addresses and act like pointers to the objects they reference. So even if two objects are equivalent or have the same state, using the equality operator would return false when comparing them.

String word1 = new String("hello");
String word2 = new String("hello");
System.out.println(word1 == word2); // false
The String class uses the equals() method to check if the two objects are equivalent (have the same characters), rather than checking to see if they are the same object in memory.

String word1 = new String("hello");
String word2 = new String("hello");
System.out.println(word1.equals(word2)); // true
If you use literal notation, or double quotes, to create a String rather than the new operator, the String will be created within the String Pool. If you attempt to create another String literal that is equivalent to a String that is already in the pool, Java will use the one in the pool rather than creating a new String.

String word1 = "hello";
String word2 = "hello";
System.out.println(word1 == word2); // true
System.out.println(word1.equals(word2)); // true
In this example, because we used literal notation, Java first created a String that has the character sequence “hello” in the String Pool and assigned it to the reference variable word1. Then, Java reused the same String object by having the reference variable word2 point to it. In this case, using either equals() or the equality operator would return true since the same object is being referenced.

It is best practice to use equals() over the equality operator when comparing objects, including Strings.
 * 
 * 
 */
public class UniquePropertiesofStringsinJava {

	public static void main(String[] args) {
		// Strings do not use any null character for termination
		String str = "Hello, World!";
		char[] charArray = str.toCharArray();
		System.out.println("Character Array: ");
		for (char c : charArray) {
			System.out.print(c + " ");
		}
		System.out.println();

		// Strings are not modifiable
		String original = "Hello";
		String modified = original.concat(", World!");
		System.out.println("Original String: " + original);
		System.out.println("Modified String: " + modified);

		// Strings are placed in the String Pool
		String str1 = "Java";
		String str2 = "Java";
		System.out.println("str1 == str2: " + (str1 == str2)); // true

		String str3 = new String("Java");
		System.out.println("str1 == str3: " + (str1 == str3)); // false

		// Comparison of Strings is done using the equals method
		String word1 = new String("hello");
		String word2 = new String("hello");
		System.out.println("word1 == word2: " + (word1 == word2)); // false
		System.out.println("word1.equals(word2): " + word1.equals(word2)); // true

	}

}

// String Methods
/*
 * 
 * To fully utilize the String class to its full potential, we need to understand the methods that come with a string object. Below are commonly used String methods:

toUpperCase() - Converts all the characters of a string to upper case.
toLowerCase() - Converts all the characters of a string to lower case.
charAt(int index) - This returns the indexed character of a string, where the index of the initial character is 0.
concat(String s) - This returns a new string consisting of the old string + s.
equals(String s) - Checks if two strings are equal.
equalsIgnoreCase(String s) - This is like equals(), but it ignores the case (e.g., ‘Hello’ and ‘hello’ are equal).
indexOf(char c) - Returns the index of the first occurrence of a character within a String. Returns -1 if the character is not found.
length() - Returns the number of characters in the current string.
replace(char old, char new) - This returns a new string, generated by replacing every occurrence of old with new.
trim() - Returns the string that results from removing white space characters from the beginning and end of the current string.
*/
