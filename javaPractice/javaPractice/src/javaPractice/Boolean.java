package javaPractice;

public class Boolean {
    // Method that checks if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Flag value: " + flag);

        int num = 7;
        boolean result = isEven(num);
        System.out.println(num + " is even? " + result);

        // Boolean expression
        if (result) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }

}