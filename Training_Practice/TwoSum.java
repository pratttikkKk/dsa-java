import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {//1,3,4,6,8,9 >> 1,9 4,6
HashMap<Integer,Integer> hMap = new HashMap<>();
for(int i=0; i<nums.length; i++){
    int complement = target-nums[i];
    if(hMap.containsValue(complement)){
     return new int[] {i,hMap.get(complement)};
    }
    hMap.put(i,nums[i]);
}
return new int[]{};


    }

    public static void main(String[] args) {
int[] nums = {1,3,4,6,8,9};
int target = 16;
    
int[] result = twoSum(nums, target);
System.out.println(result[0]+" , "+result[1]);
    }
}