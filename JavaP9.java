// kon bada he 3no me se.

import java.util.*;

public class JavaP9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        sc.close();

        if (number1 > number2 && number1 > number3) {
            System.out.println("num1 is largest :" + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("num2 is largest :" + number2);
        } else {
            System.out.println("num3 is largest :" + number3);
        }


    }
}
