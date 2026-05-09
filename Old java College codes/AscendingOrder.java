import java.util.*;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3,6,56,23,12,4};

        Arrays.sort(numbers); 

        System.out.println("numbers in Ascending Order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
