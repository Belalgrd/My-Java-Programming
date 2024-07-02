// half pyramid patterns print karna digit patterns me.


public class JavaP19 {
    public static void main(String[] args) {
        int n = 5;
        for (int line=1; line<=n; line++) {
            for (int digit=1; digit<=line; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}
