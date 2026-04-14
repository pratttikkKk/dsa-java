
public class CheckSorted {
	public static void main(String[] args) {
		int[] arr={1,3,5,7,9,11,12,31,90,56};
	System.out.println(check(arr, 0));
	}
	static boolean check(int[] arr, int index){
       
				 if(index==arr.length-1){
					return true;
				 }
				   if(arr[index] > arr[index+1]){
					return false;
				 }
				 return check(arr, index+1);

	}
}
