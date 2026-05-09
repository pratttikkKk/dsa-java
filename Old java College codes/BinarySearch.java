import java.util.*;
public class BinarySearch{
	public static int binarysearch(int[] arr, int target){
		int left=0;
		int right=arr.length-1;
		
		while(left<=right){
			int mid = left+(right-left)/2;
			if(arr[mid] == target){
				return mid;
			}
			else if(target<arr[mid]){
				right=mid-1;
			}
			else if(target>arr[mid]){
				left=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int number[]={20,30,40,50,60};
		int target;
		Scanner input = new Scanner(System.in);
		System.out.println("enter target number:");
		target=input.nextInt();

		int result=binarysearch(number,target);

			if(result != -1){
				System.out.println("The targated number is present at index : "+ result);
			}
			else{
				System.out.println("Target not found.");
			}

		
	}

}