public class HollowDiamondPyramid {
    public static void main(String[] args) {
        int limit = 10;

        // outer loop to handle upper part
        for (int i = 1; i <= limit; i++) {
            // inner loop to print spaces
            for (int j = 1; j <= limit - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (int i = limit-1; i >= 1; i--) {
            // inner loop to print spaces
            for (int j = 1; j <= limit - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
