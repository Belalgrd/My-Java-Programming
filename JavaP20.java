public class JavaP20 {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        // inner loop
        for (int line=1; line<=n; line++) {
            // outer loop
            for (int i=1; i<=line; i++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    
    }
}
