public class PalindromeTriangle {
    public static void main(String[] args) {
        int limit = 10;
        int flag = 0;
        int tempInt = 0;

        // main loop
        for (int i = 1; i < limit; i=i+2) {
            // white space loop
            for (int j = limit; j > i; j--) {
                System.out.print(" ");
            }
            // char loop
            tempInt++;
            for (int k = 1; k <= i; k++) {
                if (flag == 0) {
                    System.out.print(tempInt+" ");
                    tempInt--;
                    if (tempInt == 0) {
                        flag = 1;
                        tempInt++;
                    }
                } else {
                    tempInt++;
                    System.out.print(tempInt+" ");
                }
            }
            flag = 0;
            // next line
            System.out.println();
        }
    }
}

/* Expected output */
//       1 
//     2 1 2
//   3 2 1 2 3
// 4 3 2 1 2 3 4
