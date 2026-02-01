

public class SubArray_Kadanes {
    public int maxSubArray(int[] nums) {

        int currentSum= nums[0];
        int maxSum = nums[0];
        for(int i=1; i<nums.length; i++){
            currentSum= Math.max(nums[i], currentSum+nums[i]);   
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
    // public static void main(String[] args) {                         //static method can only call static methods
	// 	int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
	// 	int result = maxSubArray(nums);
    //     System.out.println(result);
    //     }

    public static void main(String[] args) {        // this method create an object to call a not static method.
SubArray_Kadanes obj = new SubArray_Kadanes();
int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
int result = obj.maxSubArray(nums);
System.out.println(result);
  } 
    } 
