// public class Fibonnacci{
// 	public static void main(String[] args) {
// 	System.out.print(fibo(0,1,7));

	 
// 	}
// 	static int fibo(int a, int b,int n){
// 		if(n==0){
// 			return a;       //6
// 			                //0,1,1,2,3,5,8,13
// 		}
// 		return fibo(b, a+b , n-1);
// 	}

// }
public class Fibonnacci{
public static void main(String[] args) {
	System.out.println(fibo(4));
}
static int fibo(int n){
	if(n<2){
		return n;
	}
	return fibo(n-1)+fibo(n-2);
}
}