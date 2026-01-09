public class LinearSearch {
	public static void main(String[] args) {
		int[] arr={1,3,5,7,9};
		int target=7;
		int ans = Linear(arr, target);
		System.out.println(ans);
		
	}
	static int Linear(int[] arr, int target){
		if (arr.length==0){
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			int ele= arr[i];
			if(ele == target){
				return i;
			}
			  
		}
		return -1;

	}
	
}
