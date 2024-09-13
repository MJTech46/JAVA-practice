public class RightPascalTriangle {
    public static void main(String[] args) {
        int limit = 4;
        char curBinLp1 = '*';
        char curBinLp2;

        // forward
        for (int i = 1; i <= limit; i++) {
            curBinLp2 = curBinLp1;
            for (int j = 1; j <= i; j++) {
                System.out.print(curBinLp2+" ");
                if (curBinLp2 == '*') {
                    curBinLp2 = ' ';
                } else {
                    curBinLp2 = '*';
                }
            }
            System.out.println();
            if (curBinLp1 == '*') {
                curBinLp1 = ' ';
            } else {
                curBinLp1 ='*';
            }
        }
        // revers
        for (int i = limit-1; i >= 1; i--) {
            curBinLp2 = curBinLp1;
            for (int j = 1; j <= i; j++) {
                System.out.print(curBinLp2+" ");
                if (curBinLp2 == '*') {
                    curBinLp2 = ' ';
                } else {
                    curBinLp2 = '*';
                }
            }
            System.out.println();
            if (curBinLp1 == '*') {
                curBinLp1 = ' ';
            } else {
                curBinLp1 = '*';
            }
        }
    }
}

/* Expected output */
// * 
//   *
// *   *
//   *   *
// *   *
//   *
// *
