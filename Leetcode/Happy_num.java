import java.util.HashSet;

public class Happy_num{

public static void main(String[] args) {
    boolean result = IsHappy(19);
    if(result){
    System.out.println("It is a happy number");
    }
    else{
        System.out.println("it is not a happy number");
    }
}
  private static int getNext(int num){
    int sum=0;
    
    while(num >0){
       int digit = num%10;                   //digit=9      digit 1
       sum = digit*digit +sum;              //sum=9*9+0     sum=1*1+9*9  = 82          
      num = num/10;                         //num=1          less than 0 out of loop
    } 
    return sum;                              //return 82
}
 public static boolean IsHappy(int num){
    HashSet<Integer>  seen =new HashSet<>();
    while(num !=1){
    if(seen.contains(num)){
        return false;
}
    seen.add(num);
        num=getNext(num);
 }return true;
 }

}