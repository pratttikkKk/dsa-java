public class RichestWealth {
	public static void main(String[] args) {
		int[][] accounts = {{1,2,3},{4,5,6},{7,8,9},{1,6,5}};               //2D Array Input
		int max=0;
		for(int i=0; i<accounts.length; i++){
			int sum=0;

			for (int j = 0; j < accounts[i].length; j++) {
					sum = sum + accounts[i][j]; 
			}
			if(sum>max){
				max= sum;
			}
		}
		System.out.println(max);
	}
}
