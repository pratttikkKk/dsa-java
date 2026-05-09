import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);	

int a=1;
		System.out.println("enter the no for factorial:");
		int n=SC.nextInt();
		for (int i = 1; i <= n; i++) {
			a *= i;
			
		}
		System.out.println("factorial:"+a);
      
		
		
	}
	
}
