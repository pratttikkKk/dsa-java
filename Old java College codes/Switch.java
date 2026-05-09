import java.util.Scanner;
public class Switch{
	public static void main(String[] args) {
		
	Scanner in= new Scanner(System.in);
		System.out.println("enter the cricketer name:");
		String name=in.next();
		switch(name){
			case "rohit":
			System.out.println("the hitman sharma.!!!");
			break;

			case "virat":
			System.out.println("the runmachine kohli.!!!");
			break;
			case "dhoni":
			System.out.println("the captain cool.!!!");
			break;
			case "bumrah":
			System.out.println("the yorker king.!!!");
			break;
			default:
			System.out.println("no match found.");
			break;
		}

	}
}