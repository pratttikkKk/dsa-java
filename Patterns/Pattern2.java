

public class Pattern2 {
	
	public static void main(String[] args) {
		System.out.println("pattern2:");
		p2();
		System.out.println("Pattern3:");
    p3();

    System.out.println("Pattern4:");
    p4();
   System.out.println("Pattern5:");
		p5();
	}

	static void p2() {
		/*
	-----------
	****
	****
	****
	****
	-----------
	*/
			int n=4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
					System.out.print("*");
			}
				System.out.println();
		}
	}

	static void p3(){
		/*
	-----------
	****
	***
	**
	*
	-----------
	*/
	int n=4;

	for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n+1-i; j++) {
					System.out.print("*");
			}
			System.out.println();
	}
		
	}

	static void p4() {
			/*
	-----------
	1
	12
	123
	1234
	12345
	-----------
	*/
			
	for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
					System.out.print(j);
			}
			System.out.println();
	}
	}

	static void p5() {
				/*
	-----------
	*
	**
	***
	****
	*****
	****
	***
	**
	*
	-----------
	*/
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
