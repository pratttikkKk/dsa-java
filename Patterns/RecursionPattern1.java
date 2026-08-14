import java.util.Arrays;

public class RecursionPattern1 {
	public static void main(String[] args) {
		//triangle(10, 0);
		//triangle2(4, 0);
		int[] arr = {3,4,1,2,11,2,345,6,0,2,66};
bubblesort(arr, arr.length-1, 0);
System.out.println(Arrays.toString(arr));
	}

	static void triangle(int r, int c){
     if(r==0){
			return;
		 }
		  if(r>c){
				System.out.print("*");
				triangle(r, c+=1);
			}
			else{
				System.out.println();
				triangle(r-=1, 0);
			}

	}

	static void triangle2(int r, int c){
     if(r==0){
			return;
		 }
		  if(r>c){
				triangle2(r, c+1);
				System.out.print("*");
			}
			else{
				triangle2(r-1, 0);
								System.out.println();

			}

	}

	static void bubblesort(int[] arr, int r , int c) {
		if(r==0) return;

		if(c<r){
			if(arr[c]>arr[c+1]){
				int temp = arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			bubblesort(arr,r, c+1);
		}
		else{
			bubblesort(arr, r-1, 0);
		}
	}
}
