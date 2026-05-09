import java.util.Scanner;
public class Evenodd {
	public static void main(String[] args){
    Scanner input=new Scanner(System.in);
	System.out.println("enter the number to check the it is even or odd:");
	int n=input.nextInt();
	if(n%2==0){
		System.out.println(n+" is even number.");
	}
	else{
		System.out.println(n+" is odd number.");
	}

	}
}
