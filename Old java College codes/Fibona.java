/*import java.util.Scanner;

public class Fibona{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the position of the Fibonacci number you want: ");
		int n = input.nextInt();
		if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }
		int a = 0;
		int b = 1;
		int next=0;
		int count = 0;
		
        while(count <= n){

		 next = a+b;
			a = b;
			b = next;
			count++;
		}
		System.out.println(next);
	}
	} 



import java.util.Scanner;

public class Fibona{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
           System.out.println("enter the no of terms you want in fibona series:");
        int n=in.nextInt();
   
        
        System.out.println("enter the first term:");
        int a=in.nextInt();
        System.out.println("enter the second term:");
        int b=in.nextInt();


        if(n <=0){
            System.out.println("The fibona series is:");
        
            System.out.println("enter the positive intiger:");

        }
        if(n == 1){
            System.out.println(a);
        }
        if(n == 2){
              System.out.println("The fibona series is:");
        
            System.out.println(a+","+b);
        }
        
       if(n >=3){
        System.out.println("The fibona series is:");
        
        System.out.println(a);
        
        System.out.println(b);
      for(int i=2;i<n; i++){


            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;}
      }
    }
}
*/
import java.util.Scanner;
public class Fibona{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. of terms for fibona series:");
        int n = sc.nextInt();
        int a=0;
        int b=1;
       
        if(n == 1){
            System.out.println("0");
           }
           else if(n == 2){
            System.out.println("0,1");
           }
else if(n>=3) {
    System.out.println(a);
    System.out.println(b);
    for (int i=2; i<n; i++){
    int next=a+b;
     System.out.println(next);
     a=b;
     b=next;
    }


}
     
        }
        
}






	