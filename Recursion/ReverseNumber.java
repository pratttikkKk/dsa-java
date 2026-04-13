public class ReverseNumber {

    public static void main(String[] args) {
        reverse(1345);
        System.out.println("\n"+ReturnReverse(1234, 0));
    }

    static void reverse(int n){
        if(n == 0){
            return;
        }

        System.out.print(n % 10);  // print last digit
        reverse(n / 10);           // remove last digit
    }
    static int ReturnReverse(int n,int rev){
       if(n==0){
        return rev;
    }
    int digit = n%10;
    rev=rev*10+digit;
    n=n/10;

    return ReturnReverse(n, rev);
    }
}