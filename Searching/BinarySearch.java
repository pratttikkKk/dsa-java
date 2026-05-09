public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 67, 89, 90, 92};
        int target = 67;

        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        System.out.println("Not found");
    }
}