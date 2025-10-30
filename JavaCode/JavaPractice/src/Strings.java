/*
Strings are commonly used objects in Java that can hold multiple characters. In Java, Strings are not primitives; they are immutable objects derived from the String class. To be immutable means that the state or value of the object cannot be altered once created.

Because Strings are immutable, all of the methods in the String class return a new String—the original is not modified. For example:

String str1 = "my string";
str1.concat(" is the best!");
System.out.println(str1);
will print out my string. Why? Because the .concat() method returns a completely different string that we are not assigning to any variable, and the original object is not changed. Thus, str1 still refers to the String "my string". In order to make the code print "my string is the best!", we would need to change line 2: str1 = str1.concat(" is the best!"); which re-assigns the reference variable str1 to the new String returned from the method. Keep in mind that the original String hasn't changed.
*/


public class Strings {

	public static void main(String[] args) {
		String str1 = "my string";
		str1.concat(" is the best!");
		System.out.println(str1);  // prints "my string"

		str1 = str1.concat(" is the best!");
		System.out.println(str1);  // prints "my string is the best!"

	}

}
