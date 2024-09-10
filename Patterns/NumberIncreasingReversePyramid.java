public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        int limit = 10;

        for (int i = limit; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

/* Expected output */
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
