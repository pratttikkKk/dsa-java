import java.util.Arrays;

public class ColorSort {
	public static void main(String[] args) {
		int[] arr = {0,1,1,1,0,0,1};
System.out.println(Arrays.toString(Sort(arr)));
	}

	static int[] Sort(int[] arr){
		int i=0,j=arr.length-1;

while(i<j){
while(arr[i] != 0 && i<j){
	i++;
}
while(arr[j] != 1&& i<j){
	j--;
}
if(i<j){
int temp=arr[i];
arr[i] = arr[j];
arr[j] = temp;
i++;
j--;
}
}

return arr;
	}
}
