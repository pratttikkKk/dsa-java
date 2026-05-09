import java.util.*;
public class Ascendingip {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int num[]=new int[10];

	System.out.println("enter 10 numbers:");
	for(int i=0; i<10; i++){
		num[i]=input.nextInt();
	}
    Arrays.sort(num);

	System.out.println("numbers are:");
	for (int i = 0; i < 10; i++) {
		System.out.println(num[i]);
	}

	}

}
