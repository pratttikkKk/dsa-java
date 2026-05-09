public class Addmatrix {
		public static void main(String[] args){
	int[][] a={
	{11,12},
	{21,22}                                   
										
	};
	int[][] b={
		{1,2},
		{3,4}
	};
	int[][] c=new int[2][2];
 //Scanner input=new Scanner(System.in);
	System.out.println("matrix A:");
	
	
	for (int i = 0; i < 2; i++) {
	 for (int j = 0; j < 2; j++) {
		System.out.print(a[i][j]+" ");
		
	}
	System.out.println();
	
	}
	System.out.println("matrix B:");
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
		   System.out.print(b[i][j]+" ");
		   
	   }
	   System.out.println();
	   
	   }
	   
	   System.out.println("The Addition of matrix is:");
	   for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			c[i][j]=a[i][j]+b[i][j];
		   System.out.print(c[i][j]+" ");
		   
	   }
	   System.out.println();
	   
	   }
	
		}
	}
	

