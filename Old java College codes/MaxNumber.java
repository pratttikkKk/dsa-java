
import java.util.Scanner;

public class MaxNumber{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter three numbers:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int max=a;
		if(a<b){
			max=b;
		}
		if(c>max){
			max=c;
		}
		System.out.println("max number is:"+max);
	}
}