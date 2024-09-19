public class ReverseMirrorImageTriangle {
    public static void main(String[] args) {
        int limit = 10;

        // Printing the upper part
        for (int i = 1; i <= limit; i++) {
        // inner loop to print spaces.
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
        // inner loop to print value of j.
        for (int j = i; j <= limit; j++) {
            System.out.print(j + " ");
        }

        // printing new line for each row
        System.out.println();
    }
    }
}
