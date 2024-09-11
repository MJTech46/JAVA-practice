public class NumberTriangleReverse {

    public static void main(String[] args) {
        int limit = 4; // only works with 1 digit numbers
        int loopInt = 1;

        // main loop
        for (int i = limit; i > 0; i--) {
            // white space loop
            for (int j = limit; j > i; j--) {
                System.out.print(" ");
            }
            // char loop
            for (int k = loopInt; k <= limit; k++) {
                System.out.print(k+" ");
            }
            loopInt++;
            // next line
            System.out.println();
        }
    }
}

/* Expected output */
//  1 2 3 4
//   2 3 4
//    3 4
//     4
