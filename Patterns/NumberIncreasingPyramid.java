public class NumberIncreasingPyramid {
    public static void main(String[] args) {
        int limit = 10;

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

/* Expected output */
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
