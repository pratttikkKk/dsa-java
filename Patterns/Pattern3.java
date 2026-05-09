public class Pattern3 {

    public static void main(String[] args) {
        p1();
    }

    static void p1() {

        int n = 5;

        for(int i = 1; i <= 2 * n - 1; i++) {

            int totalCols = i <= n ? i : 2 * n - i;

            int totalSpaces = n - totalCols;

            for(int s = 1; s <= totalSpaces; s++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * totalCols - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}