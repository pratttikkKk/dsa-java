
public class PRIME_Num {
    public static void main(String[] args) {
        int n= 11;
        boolean isPrime = true;
      for (int i = 2; i*i < n; i++) {                                     //as we know if (n = a*b) 
                                                                        //then a or b is less than sqroot of n 
                                                                        //so acc to this we just have to check till sqrt of n
        if(n%i==0){
          isPrime = false;

        } 
      }
      if(isPrime){
        System.out.println("this is a prime number");
      }
      else{
        System.out.println("number is not prime.");
      }
    }}