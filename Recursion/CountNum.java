
public class CountNum {
	public static void main(String[] args) {
		System.out.println(Counter(30405120,0));
	}
	static int Counter(int n,int count){
      if(n==0){
				return count;
			}
			 int rem=n%10;
			 if(rem ==0){
				count=count+1;
			 }
			 return Counter(n/10, count);
	}
}
