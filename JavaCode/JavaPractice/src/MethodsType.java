
/*
We did it! We made a program that can calculate the area of a triangle. But there is a fundamental problem here.
What if we needed to do the calculation for the area 3 times with different values? Let's implement that logic below. 
*/

public class MethodsType {

	public static void main(String[] args) {
		// Triangle 1
	    double triangleBase = 3.5;
	    double triangleHeight = 7.0;

	    double area = triangleBase * triangleHeight;
	    area = area / 2;


	    // Triangle 2
	    double triangleBase2 = 4.0;
	    double triangleHeight2 = 10.0;

	    double area2 = triangleBase2 * triangleHeight2;
	    area2 = area2 / 2;

	    // Triangle 3
	    double triangleBase3 = 12.0;
	    double triangleHeight3 = 3.0;

	    double area3 = triangleBase3 * triangleHeight3;
	    area3 = area3 / 2;
	    
	    System.out.println("Area of Triangle 1: " + area);
	    System.out.println("Area of Triangle 2: " + area2);
	    System.out.println("Area of Triangle 3: " + area3);

	}

}

/*
  As you see above, our program got drastically larger because we had to do the exact same operation 3 times (and this is a fairly simple algorithm we are implementing).
  What if we wanted to solve the area of 100 triangles? Are we going to write out the same algorithm 100 times?
  The way we wrote the logic above is not a practical way to write this program if we needed to calculate more than one triangle.
  This is where methods come into play.
*/