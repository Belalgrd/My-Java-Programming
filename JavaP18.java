// inverted star ko print karna ...

public class JavaP18 {
    public static void main(String[] args) {
        int n = 10;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {  //n-line+1 logic use kiya hai.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}