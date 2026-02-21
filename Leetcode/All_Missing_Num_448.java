
import java.util.ArrayList;
import java.util.List;



public class All_Missing_Num_448 {

    public List<Integer> Missing(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != idx + 1) {
                result.add(idx + 1);
            }
        }

        return result;
    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    
}
	public static void main(String[] args) {
    All_Missing_Num_448 obj = new All_Missing_Num_448();
				int[] nums ={4,3,2,7,8,2,3,1};

		 List<Integer> result1 = obj.Missing(nums);
		
		System.out.println(result1);
	}

}
