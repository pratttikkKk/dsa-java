public class FirstAndLastPosition {
        int left = 0;
        int right = nums.length-1;

        int[] result={-1,-1};
    public int searchfirst(int[] nums, int target) {

    while(left <= right){
                int mid = left + (right - left)/2;

        if(nums[mid] == target){
            result[0] = mid;
            right = mid-1;                        // manadatory for process should not go in infinite loop + to find the first occurance
        }
        else if(target < nums[mid] ){
            right = mid -1;
        }
        else if(target > nums[mid]){
            left = mid +1 ;
        }
    }}
		
		    public int searchlast(int[] nums, int target) {

		 while(left <= right){
                int mid = left + (right - left)/2;

        if(nums[mid] == target){
            result[1] = mid;
            left = mid+1;                        // manadatory for process should not go in infinite loop + to find the first occurance
        }
        else if(target < nums[mid] ){
            right = mid -1;
        }
        else if(target > nums[mid]){
            left = mid +1 ;
        }
    }
    return result[1];
	}
}
public static void main(String[] args){
	FirstAndLastPosition obj = new FirstAndLastPosition();
	int[] nums1 ={1,2,2,2,3};


	int result1= obj.search(nums1,2);         //it find's the first occurance

System.out.println(result1);

}
}


