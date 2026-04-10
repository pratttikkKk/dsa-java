public class BInarySearchRc {
	public static void main(String[] args) {
		int[] arr={1,2,5,7,9,11,21};
		int target=7;
		System.out.println(Search(arr, target, 0, arr.length-1));
	}
	public static int Search(int[] arr, int target, int s, int e){
		int mid = s+(e-s)/2;
		if(s>e){return -1;}
		if(arr[mid]==target){return mid;}
		if(target > mid){
			Search(arr, target, mid, arr.length-1);
		}
		return Search(arr, target, s, mid-1);
		}
	}

