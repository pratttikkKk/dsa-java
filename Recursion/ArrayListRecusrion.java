
import java.util.ArrayList;

public class ArrayListRecusrion {
   public static void main(String[] args) {
		int[] arr = {1,2,4,4,4};
		  System.out.println(findIndex(arr, 4, 0));
	 }

	 static ArrayList<Integer> findIndex(int[] arr, int target, int index){
		ArrayList<Integer> list = new ArrayList<>();
            if(index==arr.length){
							return list;
						}
						if(arr[index] == target){
							list.add(index);
						}
						ArrayList<Integer> answer = findIndex(arr, target, index+1);
						list.addAll(answer);

						return list;
	 }
}
