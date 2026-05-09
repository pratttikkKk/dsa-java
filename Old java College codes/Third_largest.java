import java.util.*;
public class Third_largest {
	public static void main(String[] args) {
int num[]=new int[10];
Scanner input=new Scanner(System.in);
System.out.println("enter 10 different numbers:");
for (int i = 0; i < 10; i++) {
	num[i]=input.nextInt();
}
Arrays.sort(num);
System.out.println("third largest is:");


System.out.println(num[7]);

	}
}
