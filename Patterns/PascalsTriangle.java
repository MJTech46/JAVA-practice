public class PascalsTriangle {
    public static void main(String[] args) {
        int limit = 5;


         // Printing the upper part
         for (int i = 1; i <= limit; i++) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (int j = i; j <= limit; j++) {
                if(j==i||j==limit||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // printing new line for each row
            System.out.println();
        }

        // Printing the lower part
        for (int i = limit - 1; i >= 1; i--) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (int j = i; j <= limit; j++) {
                if(j == i||j==limit||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // printing new line for each row
            System.out.println();
        }
    }
}
