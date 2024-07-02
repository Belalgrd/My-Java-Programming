// printing star pattern.

public class JavaP17 {

    public static void main(String[] args) {

        for (int line = 1; line <= 10; line++) {
            // one line
            for (int star = 1; star <= line; star++) {
                System.out.print("*"); // print use karna he println nhi to sab next line me print ho jayega.
            }
            System.out.println();
        }
    }       
}