import java.util.Arrays;

public class RunningSum {
	public static void main(String[] args) {
		
 int[] arr = {1,2,3,4};
 int[] ans = Sum(arr);
System.out.print(Arrays.toString(ans));
	}


	static int[] Sum(int[] arr){
		for (int i = 1; i < arr.length; i++) {
				arr[i]=arr[i]+arr[i-1];                                         //[1 , 3, 6 , 10]
		}
      return arr;
	} 

}
