public class ceiling {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int result = -1;   // important

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;  // exact match is also ceiling
            }

            else if (nums[mid] > target) {
                result = mid;      // possible ceiling
                right = mid - 1;   // search left for smaller ceiling
            }

            else {  // nums[mid] < target
                left = mid + 1;
            }
        }

        return result;   // -1 if no ceiling exists
    }

    public static void main(String[] args) {

        ceiling obj = new ceiling();

        int[] nums1 = {1, 2, 2, 2, 3};
        int[] nums2 = {-1, 0, 2, 4, 6, 9, 10};

        int result1 = obj.search(nums1, 2);
        int result2 = obj.search(nums2, 5);

        System.out.println(result1);  // 1
        System.out.println(result2);  // 4
    }
}