import java.util.*;
public class LinearSearch{
	public static int linearsearch(int[] arr, int target){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == target){
				return i;
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

		int result=linearsearch(number,target);

			if(result != -1){
				System.out.println("The targated number is present at index : "+ result);
			}
			else{
				System.out.println("Target not found.");
			}

		
	}

}