import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4, 3, 8, 1};

        selectionSort(arr, 0, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int c, int r, int maxIndex) {
        if (r <= 0) return;

        if (c <= r) {
            if (arr[c] > arr[maxIndex]) {
                maxIndex = c;
            }
            selectionSort(arr, c + 1, r, maxIndex);
        } else {
            int temp = arr[r];
            arr[r] = arr[maxIndex];
            arr[maxIndex] = temp;

            selectionSort(arr, 0, r - 1, 0);
        }
    }
}