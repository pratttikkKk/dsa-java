public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        int result=-1;

    while(left <= right){
                int mid = left + (right - left)/2;

        if(nums[mid] == target){
            result = mid;
            right = mid-1;                        // manadatory for process should not go in infinite loop + to find the first occurance
        }
        else if(target < nums[mid] ){
            right = mid -1;
        }
        else if(target > nums[mid]){
            left = mid +1 ;
        }
    }
    return result;

}
public static void main(String[] args){
	BinarySearch obj = new BinarySearch();
	int[] nums1 ={1,2,2,2,3};
		int[] nums2 ={-1,0,2,4,6,9,10};


	int result1= obj.search(nums1,2);         //it find's the first occurance
		int result2= obj.search(nums2,9);

System.out.println(result1);
System.out.println(result2);

}
}
