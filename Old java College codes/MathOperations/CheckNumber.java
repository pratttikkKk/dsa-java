import java.util.Scanner;
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}


public class CheckNumber {

    // Method that throws OddNumberException if number is odd
    public static void checkEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number " + num + " is odd!");
        }
        System.out.println("Number " + num + " is even.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = sc.nextInt();

        try {
            checkEven(input);
        } catch (OddNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

