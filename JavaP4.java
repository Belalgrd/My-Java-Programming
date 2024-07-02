// if else statement ka problem.

import java.util.*;
public class JavaP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 13 && age < 18){
            System.out.println("Teenagers Age");
        }
        
        if (age >= 18) {
            System.out.println("You are Adult.");
            System.out.println("College");
            System.out.println("Vote");
            System.out.println("Drive");
            sc.close();
            
        }
            else {
            System.out.println("Not Adult");
        }
    }
}