import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
	public static void main(String[] args) {
		int[] nums= {2,1,5,3,4};

		System.out.println(Arrays.toString(Greater(nums)));
	}
	public static int[] Greater(int[] nums){
int n= nums.length;
int[] ans = new int[n];
Arrays.fill(ans,-1);
Stack<Integer> stack = new Stack<>();

for(int i=n-1; i>=0; i--){
	while(!stack.isEmpty()&&nums[i]>stack.peek()){

	stack.pop();

	}
	if(stack.peek()>nums[i]){
ans[i]=stack.peek();
	}
}
return ans;
	}
}
