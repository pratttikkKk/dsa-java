import java.util.Scanner;
public class display {
	public static void main(String[] args){
Scanner input=new Scanner(System.in);
int num[]=new int[10];

System.out.print("enter 10 numbers:");
for(int i=0; i<10; i++){
	num[i]=input.nextInt();
}
System.out.print("the elements are:");
for(int i=0; i<10; i++){
	System.out.print(num[i]);
}
	}
}
