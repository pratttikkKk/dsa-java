public class MinMax {
	public static void main(String[] args) {

	int[] arr = {2,4,6,8,9,7,5,3,1};

	int max= arr[0];
	int min= arr[0];

	for(int i=0; i<arr.length; i++){
     if(arr[i]>max){
		max=arr[i];
	 }

	 if (arr[i]<min) {
		min =arr[i];
		 
	 }
}
	System.out.println(max);
	System.out.println(min);

	//Min.minimum(arr);
}
	
}

// class Min{

// 	public static void minimum(int[] arr){

// 		 int min =arr[0];

// 		 for (int i = 0; i < arr.length; i++) {
// 			 if(arr[i]<min){
// 				min=arr[i];
// 			 }

// 		 }

// 		 System.out.println(min);
// 	}
// }