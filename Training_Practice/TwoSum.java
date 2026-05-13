import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse array
        for (int i = 0; i < nums.length; i++) {

            // Current number
            int current = nums[i];

            // Find complement
            int complement = target - current;

            // Check if complement exists
            if (map.containsKey(complement)) {

                return new int[] { map.get(complement), i };
            }

            // Store current number with index
            map.put(current, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}