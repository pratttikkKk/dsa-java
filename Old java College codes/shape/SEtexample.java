
import java.util.*;

public class SEtexample {
	public static void main(String[] args) {
		Set<String> boys = new HashSet<>();
		boys.add("pratik");
		boys.add("kartik");
		boys.add("hardik");
		boys.add("hardik"); //set ingores the duplicates
		System.out.println(boys);
	
		
		for(String singleboy :boys){
			System.out.println("boy name is "+singleboy+".");

		}
	}
}
