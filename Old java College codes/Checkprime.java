import java.util.*;
class Checkprime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check prime number:");
		int n=sc.nextInt();
		int count=0;

		for (i=1; i<=n; i++){
			int rem=n%i;
		

		if(rem==0){
			count++;
		}
		}
		if (count == 2){
			System.out.println("number is prime");
		} 
		else{
			System.out.println("not rpime number")z
		}
	}
}