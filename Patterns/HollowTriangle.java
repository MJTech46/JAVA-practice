public class HollowTriangle {
    public static void main(String[] args) {
        char c = '*';
        int limit = 10;

        // main loop
        for (int i = 1; i < limit; i+=2) {
            // spacing loop
            for (int j = 0; j < (limit - i); j++) {
                System.out.print(" ");
            }

            // printing char
            System.out.print(c+" ");

            // inner spacing loop
            for (int k = 0; k < i-2; k++) {
                System.out.print("  ");
            }

            // printing char
            if (i != 1) {
                System.out.println(c);
            } else {
                System.out.println();
            }
        }
        // base loop
        for (int j = 0; j <= (limit/2)+1; j++) {
            System.out.print(c+"  ");
        }

        // new line
        System.out.println();
    }
}
/* expected output */

//       * 
//     *   *
//    *      *
//   *         *
//  *            *
// *  *  *  *  *   * 
