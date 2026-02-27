public class Variable_Size_SW {
	public static void main(String[] args) {
			int[] nums={2,3,1,2,4,3};

			int left=0;
			int minLength = nums.length;
			int sum=0;
			int target=7;

			for (int right = 0; right < nums.length; right++) {
          sum=sum+nums[right];

					while (target<=sum) {
						minLength= Math.min(minLength, right-left+1);
            sum = sum - nums[left];
						left++;
							
					}

					
			}
								System.out.println(minLength);

		}
}
