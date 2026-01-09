import java.util.Scanner;
public class LinearSearchinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[10];
		System.out.println("enter the arr");
		for (int i = 0; i < 10; i++) {
			
		
		arr[i]= sc.nextInt();
	  }
	    System.out.println("enter the target element");
	       int tar = sc.nextInt();
		
	

	int ans = Lin(arr, tar);
	   System.out.println(ans);
	   } 

	static int Lin(int[] arr, int tar){
		if(arr.length==0){
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			if(ele == tar){
				return i;
				}
		}
		return -1;
	
}}
