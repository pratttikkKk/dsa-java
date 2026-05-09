/*public class Multimatrix {
		public static void main(String[] args){
	int[][] a={
	{11,12},
	{21,22}                                   
										
	};
	int[][] b={
		{1,2},
		{3,4}
	};
	int[][] c = new int[2][2];
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
	   
	   System.out.println("The Multiplication of matrix is:");
	   for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			c[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j];
		   System.out.print(c[i][j]+" ");
		   
	   }
	   System.out.println();
	   
	   }
	
		}
	}
	
*/
public class Multimatrix{
	public static void main(String[] args) {
		int[][] a={
			{1,2},
			{3,4}
		};
		int[][] b={
			{11,22},
			{33,44}
		};
		int[][] m=new int[2][2];
		System.out.println("the multiplication is:");
		for(int i=0; i<2; i++){
			for (int j = 0; j < 2; j++) {
				m[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j];
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}

	}


}