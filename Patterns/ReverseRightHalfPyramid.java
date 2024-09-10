public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
        char c = '*';
        int limit = 10;

        for (int i = limit; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}

/* Expected output */
// * * * * *
// * * * *
// * * *
// * *
// *
