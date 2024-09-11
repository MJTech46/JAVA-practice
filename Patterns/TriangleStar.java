public class TriangleStar {

    public static void main(String[] args) {
        char c = '*';
        int limit = 20;

        // main loop
        for (int i = 0; i < limit; i++) {
            // white space loop
            for (int j = limit; j > i; j--) {
                System.out.print(" ");
            }
            // char loop
            for (int k = 0; k < i; k++) {
                System.out.print(c+" ");
            }
            // next line
            System.out.println();
        }
    }
}

/* Expected output */
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
