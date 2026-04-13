public class ReverseNumber {

    public static void main(String[] args) {
        reverse(1345);
        System.out.println("\n"+ReturnReverse(1234, 0));

        ReturnReverse2(1234);
        System.out.println(sum);
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
    static int sum=0;
    static void ReturnReverse2(int n){//1234 > 4321
    if(n==0){
        return;
    }
    int rem = n%10;
    sum= sum*10+rem;
    ReturnReverse2(n/10);

    }
}