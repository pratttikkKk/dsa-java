public class Reverse {
	public static void main(String[] args){

		int n=32745987;
		int Rev=0;
		int count=0;
	
		while(n>0){

			Rev = n%10;
			System.out.print(Rev);
			n=n/10;
			count++;
		}
		
	}
}
