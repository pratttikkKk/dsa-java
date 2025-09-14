
import java.util.*;

public class ArrayaList {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<String> Cricketers = new ArrayList<>();

		Cricketers.add("Rohit Sharma");
		Cricketers.add("Virat Kohli");
		Cricketers.add("Ms Dhoni");

		numbers.add(45);
		numbers.add(18);
		numbers.add(7);

				System.out.println(Cricketers);
				System.out.println(numbers);

		System.out.println(numbers.contains(1));

				System.out.println(numbers.get(1));
				System.out.println(numbers.size());
		
				numbers.remove(2);

				System.out.println(numbers);


	}
}
