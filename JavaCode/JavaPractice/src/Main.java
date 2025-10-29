/*
A method is a block of reusable code that we can invoke as many times as we want to.
Instead of writing the same algorithm repeatedly in the main method, let's write a new method that does the algorithm for us.
*/


public class Main {

	public static void main(String[] args) {
		/*
	    The formula for a triangle is (base * height) / 2
	    So let's define 2 variables for the needed values and do the calculation below
	    */

	    double area = calculateArea(3.5, 7.0);
	    System.out.println("The area of Triangle 1 is " + area);

	    area = calculateArea(4.0, 10.0);
	    System.out.println("The area of Triangle 2 is " + area);

	    area = calculateArea(12.0, 3.0);
	    System.out.println("The area of Triangle 3 is " + area);

	  }

	  public static double calculateArea(double triangleBase, double triangleHeight){
	    double area = triangleBase * triangleHeight;
	    area = area / 2;

	    return area;

	}

}



/*


Notice in the above code we now have 2 methods in our class Main:

public static void main(String[] args){

}
The main method is the only method we have seen so far, and generally, it only gets called once by the JVM, so this method is a special case.
public static double calculateArea(double triangleBase, double triangleHeight){

}
This is the first practical method we have written.
*/