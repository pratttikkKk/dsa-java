
import java.util.ArrayList;
import java.util.List;

public class Listexample {
	public static void main(String[] args) {
		List<String> boys = new ArrayList<>();
		boys.add("pratik");
		boys.add("kartik");
		boys.add("hardik");
		boys.add("hardik");
		System.out.println(boys);
	
		System.out.println(boys.get(0));
		for(String singleboy :boys){
			System.out.println("boy name is "+singleboy+".");

		}
	}
}
