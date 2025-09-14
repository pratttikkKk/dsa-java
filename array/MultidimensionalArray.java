
import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
 public static void main(String[] args) {
	// int[][] arr={
	// 	{1,2,3},
	// 	{4,5,6},
	// 	{7,8,9}
	// };
	 Scanner sc = new Scanner(System.in);
	 
	 int r=sc.nextInt();
	 int c=sc.nextInt();

 int[][] arr = new int[r][c];

System.out.println("enter the elemets");
	 for(int row=0; row<arr.length; row++){
		for(int col=0; col<arr[row].length; col++){
			arr[row][col] = sc.nextInt();
		}
	}

System.out.println(" the matrix  elemets");
	 for(int row=0; row<arr.length; row++){
		for(int col=0; col<arr[row].length; col++){
			System.out.print(arr[row][col]+ " ");
		}
		System.out.println("");
	 }
	 
System.out.println(Arrays.toString(arr[r]));
	
	}
	
}
