/*
Primitive Types
Java makes an important distinction between primitive types and reference types:

Primitive types are the data types defined by the language itself.
Reference types are types defined by classes in the Java application programming interface (API) or by classes you create rather than by the language itself.
A key difference between a primitive data type and a reference type is that the memory location associated with a primitive-type variable contains the actual value of the variable.
As a result, primitive types are sometimes called value types. By contrast, the memory location associated with a reference-type variable contains an address (called a pointer) that indicates the memory location of the actual object.

Java defines a total of eight primitive types, listed in the table below.
Of the eight primitive types, six are for numbers, one is for characters, and one is for true/false values.
int is the default whole number data type and double is the default decimal type.
To memorize the eight primitive data types of Java, we have developed a saying: Bitter black coffee sure is for long days.
The first character of each word in this sentence is equivalent to the first character of a primitive data type.
If you can memorize that sentence, not only can you identify all of the data types, you will also know the sizes of the data types from smallest to largest.
There are 8 primitive data types.
*/

public class PrimitiveType {

	public static void main(String[] args) {
		// byte: 1 byte (8 bits) -128 to 127
		byte byteVar = 100;
		System.out.println("Byte Value: " + byteVar);

		// short: 2 bytes (16 bits) -32,768 to 32,767
		short shortVar = 20000;
		System.out.println("Short Value: " + shortVar);

		// int: 4 bytes (32 bits) -2,147,483,648 to 2,147,483,647
		int intVar = 1500000000;
		System.out.println("Int Value: " + intVar);

		// long: 8 bytes (64 bits) -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long longVar = 9000000000L;
		System.out.println("Long Value: " + longVar);

		// float: 4 bytes (32 bits) -3.40282347E+38F to 3.40282347E+38F
		float floatVar = 5.75f;
		System.out.println("Float Value: " + floatVar);

		// double: 8 bytes (64 bits) -1.79769313486231570E+308 to 1.79769313486231570E+308
		double doubleVar = 19.99d;
		System.out.println("Double Value: " + doubleVar);

		// char: 2 bytes (16 bits) '\u0000' (or 0) to '\uffff' (or 65,535)
		char charVar = 'A';
		System.out.println("Char Value: " + charVar);

		// boolean: 1 bit true or false
		boolean booleanVar = true;
		System.out.println("Boolean Value: " + booleanVar);

	}

}




/*
Real World Application

Primitive data types in Java exist for several reasons:

Efficiency: Primitive data types are more memory-efficient and have better performance compared to their object counterparts. They directly represent simple values and don't require additional memory overhead.

Simplicity: Primitive data types provide a simple way to represent basic data values such as integers, floating-point numbers, characters, and booleans. This simplicity makes them easy to understand and use.

Language design: Primitive data types are an integral part of Java's language design. They allow for basic operations and manipulations at a low level, which is essential for programming tasks ranging from simple calculations to complex algorithms.

Historical reasons: Java inherited primitive data types from languages like C and C++, which also have similar concepts. This familiarity makes it easier for developers coming from these languages to transition to Java.

Overall, primitive data types in Java serve to provide a foundational set of data representations that are efficient, simple, and well-suited for various programming tasks.
*/