public class Sliding_Window {
	public static void main(String[] args){
 
		int[] arr = {2,1,5,1,3,2};
		int windowSum =0;
		int k=3;
		for (int i = 0; i < k; i++) {
				windowSum += arr[i];
		} 
		int maxsum=windowSum;

		for (int i = k; i < arr.length; i++) {
						windowSum+=arr[i];                                    //Adds new element in subarray of size k
						windowSum-=arr[i-k];                                 //removes the old element.
						maxsum=Math.max(maxsum, windowSum);                 //Chooses the max value from previous max sum and current windowsum and store max value as new maxsum

		}
System.out.println(maxsum);
		

	}
}
