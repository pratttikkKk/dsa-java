import java.util.Scanner;
public class Temp{
	public static void main(String[] args){

		Scanner Input = new Scanner(System.in);
		System.out.println("enter the temperature in celcius:");
		float tc = Input.nextFloat();

		float tf =(tc*9/5)+32;

		System.out.println("the temperature in faranite is:"+tf);
		


	}
}