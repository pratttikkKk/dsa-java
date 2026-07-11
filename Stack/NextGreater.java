import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
	public static void main(String[] args) {
		int[] nums= {2,1,5,3};

		System.out.println(Arrays.toString(Greater(nums)));
	}
	public static int[] Greater(int[] nums){

	int[] ans = new int[nums.length];
Arrays.fill(ans, -1);
	Stack<Integer> stack = new Stack<>();

	for(int i=0; i<nums.length; i++){
		while(!stack.isEmpty() && nums[i] >stack.peek()){
     
		 int index = stack.pop();
      ans[index] = nums[i];

		}
		stack.push(i);
	}
return ans;
	}
}
