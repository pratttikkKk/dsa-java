public class AdditionNum {
    public static void main(String[] args) {
        int n = 2351723;
        int sum = 0; 

        while (n > 0) {
            int rem = n % 10; 
            sum += rem; 
            n /= 10; 
        }

        System.out.println("Addition of individual numbers is: " + sum);
    }
}
