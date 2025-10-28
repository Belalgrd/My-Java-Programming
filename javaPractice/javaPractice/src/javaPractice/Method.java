package javaPractice;

public class Method {
    // 1. No parameters, no return type
    public void greet() {
        System.out.println("Hello!");
    }

    // 2. No parameters, returns int
    public int getNumber() {
        return 42;
    }

    // 3. One parameter, no return type
    public void printMessage(String message) {
        System.out.println(message);
    }

    // 4. Two parameters, returns int
    public int add(int a, int b) {
        return a + b;
    }

    // 5. Returns boolean, checks even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 6. Returns double, calculates area of circle
    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 7. Returns String, concatenates two strings
    public String combine(String a, String b) {
        return a + b;
    }

    // 8. Returns void, prints array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 9. Returns int, finds max of three numbers
    public int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 10. Returns boolean, checks if string is empty
    public boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static void main(String[] args) {
        Method m = new Method();
        m.greet();
        System.out.println("getNumber: " + m.getNumber());
        m.printMessage("Welcome to Java!");
        System.out.println("add: " + m.add(5, 7));
        System.out.println("isEven: " + m.isEven(8));
        System.out.println("areaOfCircle: " + m.areaOfCircle(3.0));
        System.out.println("combine: " + m.combine("Hello, ", "World!"));
        m.printArray(new int[]{1, 2, 3, 4});
        System.out.println("maxOfThree: " + m.maxOfThree(10, 20, 15));
        System.out.println("isEmpty: " + m.isEmpty(""));
    }
}