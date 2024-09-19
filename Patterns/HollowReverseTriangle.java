public class HollowReverseTriangle {
    public static void main(String[] args) {
        int limit = 10;

        // outer loop to handle rows
        for (int i = limit; i >= 1; i--) {

            // inner loop to print spaces.
            for (int j = i; j < limit; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == limit || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}
