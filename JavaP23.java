// swapping two no. in java function.

public class JavaP23 {
    public static void swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        swapping(a, b);
        System.out.println( "a = " + a);
        System.out.println( "b = " + b);
    }
}
