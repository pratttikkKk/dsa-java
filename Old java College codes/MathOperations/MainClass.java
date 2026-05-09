import MathOperations.Operations;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.println("Floor: " + Operations.floor(num));
        System.out.println("Ceil: " + Operations.ceil(num));
        System.out.println("Round: " + Operations.round(num));
    }
}
