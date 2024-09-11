public class NumberTriangle {

    public static void main(String[] args) {
        int limit = 10;

        // main loop
        for (int i = 0; i < limit; i++) {
            // white space loop
            for (int j = limit; j > i; j--) {
                System.out.print(" ");
            }
            // char loop
            for (int k = 0; k < i; k++) {
                System.out.print(i+" ");
            }
            // next line
            System.out.println();
        }
    }
}

/* Expected output */
//     1
//    2 2
//   3 3 3
//  4 4 4 4
