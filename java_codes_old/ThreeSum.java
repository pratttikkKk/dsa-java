import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {7, -6, 3, 8, -1, 8, -11};
        int target = 0;
        solution(arr, target, arr.length);
    }

    public static void solution(int[] a, int target, int n) {
        Arrays.sort(a);  // Sort the array for two-pointer approach

        for (int i = 0; i < n; i++) {
            // Skip duplicates for the first element
            if (i == 0 || a[i] != a[i - 1]) {
                int j = i + 1;
                int k = n - 1;
                int tar = target - a[i];

                while (j < k) {
                    int sum = a[j] + a[k];

                    if (sum == tar) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);

                        // Skip duplicates for the second element
                        while (j < k && a[j] == a[j + 1]) j++;
                        // Skip duplicates for the third element
                        while (j < k && a[k] == a[k - 1]) k--;

                        j++;
                        k--;
                    }
                    else if (sum < tar) {
                        j++; // Increase sum
                    }
                    else {
                        k--; // Decrease sum
                    }
                }
            }
        }
    }
}
