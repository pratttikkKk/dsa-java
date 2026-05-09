public class Pattern3 {
    public static void main(String[] args) {
        p1();
    }

    static void p1() {
        /*
         *------------------
         *    *
         *   * *
         *  * * *
         * * * * * *
         *  * * *
         *   * *
         *    *
         *--------------------
         */

        int n = 4; // height of top half

        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printRow(n, i);
        }
    }

    private static void printRow(int n, int i) {
        int spaces = n - i;
        int stars = 2 * i - 1;

        for (int s = 1; s <= spaces; s++) System.out.print(" ");
        for (int k = 1; k <= stars; k++) System.out.print("*");
        System.out.println();
    }
}

