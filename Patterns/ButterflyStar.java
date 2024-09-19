public class ButterflyStar {
    public static void main(String[] args) {

        int n = 3;

        // Upper part 
        for (int i = 1; i <= n; i++) {
            // Left part 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right part 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part 
        for (int i = n; i >= 1; i--) {
            // Left part 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right part 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* Expected output */
// *    *
// **  **
// ******
// ******
// **  **
// *    *
