import java.util.*;
public class MinimumArray{
	public static void main(String[] args) {
int num[]=new int[5];
Scanner input=new Scanner(System.in);
System.out.println("enter 5 different numbers:");
for (int i = 0; i < 5; i++) {
	num[i]=input.nextInt();
}
Arrays.sort(num);
System.out.println("minimum element is:");


System.out.println(num[0]);

	}
}

