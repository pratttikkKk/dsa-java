public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        int result=-1;

    while(left <= right){
                int mid = left + (right - left)/2;

        if(nums[mid] == target){
            result = mid;
            right = mid-1;
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
	int[] nums ={-1,0,3,5,9,12};
	int result= obj.search(nums,9);
System.out.println(result);
}
}
