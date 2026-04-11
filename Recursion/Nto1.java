public class Nto1 {
	public static void main(String[] args) {
			fun(5,15);
	}
	static void fun(int s,int e){
    if(s==e){
			return;
		}
		System.out.println(s);
		fun(s+1,e);
	}
}
