import java.util.Scanner;
class cricket{
	int runs;
	String name;

	void batting(){
		System.out.println(name+" scored "+runs+" in todays match");
	}

}
public class MainClass {
	
	public static void main(String[] args) {
		cricket ck = new cricket();
		Scanner input =new Scanner(System.in);

	System.out.println("enter name of player:");
	ck.name=input.nextLine();

	System.out.println("enter runs of player:");
	ck.runs=input.nextInt();

	ck.batting();
	
}}
