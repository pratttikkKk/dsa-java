
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
int i=0;
int fact=1;

while(n>0){

	fact=fact*n;
	n=n-1;
	i++;
}
System.out.print(fact);

	}
}
