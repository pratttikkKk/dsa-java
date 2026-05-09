public class Pattern3 {
	public static void main(String[] args) {
			
	}
	static void p1() {
			/*------------------ 
			    *
	 		   * *
        * * *
			 * * * *
			  * * *
				 * *
				  * 
    	--------------------*/
			int m=5;
  int n=9;
	for (int i = 1; i <= n; i++) {
		int totalCol = i>m ? m+5-i : i;
			for (int j = 1; j <= totalCol; j++) {
					System.out.print("*");
			}
			System.out.println();
	}
	}
}
