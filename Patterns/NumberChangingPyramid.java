public class NumberChangingPyramid {
    public static void main(String[] args) {
        int limit = 10;
        int current_int = 1;

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(current_int+" ");
                current_int++;
            }
            System.out.println();
        }

    }
}

/* Expected output */
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
