public class RunningSum {
	public static void main(String[] args) {
		
		int[] arr={1,2,3,4};                //1,3,6,10
	 int sum=0;
	 int[] arr2 =new int[4];

	 for (int i = 0; i < arr.length; i++) {
			sum= sum+arr[i];
			arr2[i]=sum;
			
	 }
	 for (int j = 0; j < arr.length; j++) {
	 System.out.println(arr2[j]);
	}}
}
