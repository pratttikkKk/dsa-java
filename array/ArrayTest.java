
class tester{
	
	public static void insert(char[] arr, int pos, char ch) {
          
		for(int i=arr.length-1; i>=pos; i--){
			arr[i]=arr[i-1];

		}
		arr[pos-1]=ch;
	}
		
	}

	class ArrayTest{
	 public static void main(String[] args) {                                 //array = a b c d e 
		char[] arr= new char[6];

		arr[0]='a';
		arr[1]='b';
		arr[2]='c';
		arr[3]='d';
		arr[4]='e';
		//arr[6]='f';

		tester.insert(arr, 2, 'j');

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}


	}
}
