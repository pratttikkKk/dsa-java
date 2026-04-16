
import java.util.ArrayList;


public class Search{
	public static void main(String[] args) {
		int[] arr={1,3,5,7,9,9,9,11,12,31,90};
    int target =5;
		// int[] arrs={1,2,3,5,5,5,6,7,7,8,9};
	System.out.println(findIndex(arr,target, 0));
	System.out.println(findArrayListIndex(arr,9, 0, new ArrayList<>()));

	// findAllIndex(arrs, target,0);
	// System.out.println(list);
	}
	static int  findIndex(int[] arr, int target,int index){
       
				 if(index==arr.length-1){
					return -1;
				 }
				   if(arr[index] == target){
					return index;
				 }
				 return findIndex(arr,target, index+1);

	}
	// static ArrayList<Integer> list = new ArrayList<>();
	// static void  findAllIndex(int[] arrs, int target,int index){
       
	// 			 if(index==arrs.length){
	// 				return;
	// 			 }
	// 			   if(arrs[index] == target){
	// 				  list.add(index);
	// 			 }
	// 			 findAllIndex(arrs,target, index+1);

	// }
	static ArrayList<Integer> findArrayListIndex(int[] arr, int target,  int index, ArrayList<Integer> list){  //1,2,3,3,4,5
		if(index == arr.length){
			return list;
		}
		if(arr[index]==target){
			list.add(index);
		}

		return findArrayListIndex(arr, target, index+1, list);
	}
}
