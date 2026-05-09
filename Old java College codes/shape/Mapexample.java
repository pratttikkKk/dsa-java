
import java.util.*;

public class Mapexample {
	public static void main(String[] args) {
		Map<Integer,String> boys = new HashMap<>();
		boys.put(101,"pratik");
		boys.put(102,"kartik");
		boys.put(103,"hardik");
		boys.put(104,"hardik"); //set ingores the duplicates
		System.out.println(boys);
	
		
		for(Map.Entry<Integer,String> obj : boys.entrySet()){
			System.out.println("boy name id is "+obj.getKey()+" & boy name is " +obj.getValue());

		}
	}
}
