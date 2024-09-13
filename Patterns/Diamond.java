public class Diamond {
    public static void main(String[] args) {
        char c = '*';
        int limit = 4;


        // forward loop
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
        // reverse loop
        for (int i = limit; i > 0; i--) {
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
//    *
//   * *
//  * * *
// * * * *
//  * * *
//   * *
//    *
