public class SumOfDigits {
	public static void main(String[] args) {
			System.out.println(Sum(1345));
		
	}
	static int Sum(int n){
		if(n<1){return 0;}
		
		return n%10+Sum(n/10);

	}
}
