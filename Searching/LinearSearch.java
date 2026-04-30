public class LinearSearch{
	public static void main(String[] args) {
			int target=90;
			int[] arr = {1,4,5,67,89,90,92};

			for(int i=0; i<arr.length; i++){
				if(arr[i]==target){
					System.out.println(arr[i]+" present at index "+i);
				}
			}
	}

}