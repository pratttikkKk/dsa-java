public class ReverseNumber {

    public static void main(String[] args) {
        reverse(1345);
    }

    static void reverse(int n){
        if(n == 0){
            return;
        }

        System.out.print(n % 10);  // print last digit
        reverse(n / 10);           // remove last digit
    }
}