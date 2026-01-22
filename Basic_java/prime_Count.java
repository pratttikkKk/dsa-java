

public class prime_Count {
    public static void main(String[] args) {
			int n=10;

        int count=0;
         
        for(int i=2; i<n; i++){
        for(int j=2; j*j<i; j++){
            if(i%j ==0){
               count ++;
               System.out.print(i);
            }
            }
      
        
    }
		  System.out.println(count); 
	}}