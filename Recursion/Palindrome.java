class solution{
    int reverse = 0;
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        reverse=0;
        helper(x);
        return reverse == x;
    }
    void helper(int x){
        if(x==0){return;}
        int digit = x%10;
        reverse=reverse*10 +digit;
        helper(x/10);
    }
}
public class Palindrome{
    public static void main(String[] args) {
solution obj = new solution();
System.out.println(obj.isPalindrome(121));
System.out.println(obj.isPalindrome(12451));
System.out.println(obj.isPalindrome(-141));
System.out.println(obj.isPalindrome(12421));
}}