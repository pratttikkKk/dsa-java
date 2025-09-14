import java.util.Arrays;
import java.util.Scanner;

public class BasicArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];

		System.out.println("enter the array elements:");

		for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
			
		}

		System.out.println("elements is : ");
		for (int i= 0; i < arr.length; i++) {    //method 1 to print arrays
			System.out.println(arr[i]);
			
		}

		System.out.println(Arrays.toString(arr));      //method 2 to print arrays

		for(int num :arr){
			System.out.println(num+ " ");               //method 3 to print arrays
		}
	}
}
