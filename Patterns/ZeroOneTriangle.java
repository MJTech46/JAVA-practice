public class ZeroOneTriangle {
    public static void main(String[] args) {
        int limit = 10;
        int curBinLp1=1;
        int curBinLp2;

        for (int i = 1; i <= limit; i++) {
            curBinLp2 = curBinLp1;
            for (int j = 1; j <= i; j++) {
                System.out.print(curBinLp2+" ");
                if (curBinLp2 == 1) {
                    curBinLp2 = 0;
                } else {
                    curBinLp2 = 1;
                }
            }
            System.out.println();
            if (curBinLp1 == 1) {
                curBinLp1 = 0;
            } else {
                curBinLp1 = 1;
            }
        }
    }
}
