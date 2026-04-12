public class SumOfDigits {
	public static void main(String[] args) {
			System.out.println(Sum(1345));
		
	}
	static int Sum(int n){
		int digit=n%10;
		if(n<1){return 0;}
		return digit+Sum(n/10);

	}
}
