public class RotatedCount {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(countRotation(arr));
    }

    private static int countRotation(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // If array already sorted
            if (arr[start] <= arr[end]) {
                return start;
            }

            int mid = start + (end - start) / 2;

            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            // Check if mid is minimum
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            // Left half sorted → go right
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            // Right half sorted → go left
            else {
                end = mid - 1;
            }
        }

        return 0;
    }
}