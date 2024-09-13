public class LeftHalfPyramidReverse {
    public static void main(String[] args) {
        char c = '*';
        int limit = 10;
        
        for (int i = limit; i >= 1; i--) {
            // space loop
            for (int j = limit-i; j > 0; j--) {
                System.out.print("  ");
            }
            // char loop
            for (int j = 1; j <= i; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}

/* Expected output */
// * * * *
//   * * *
//     * *
//       * 
