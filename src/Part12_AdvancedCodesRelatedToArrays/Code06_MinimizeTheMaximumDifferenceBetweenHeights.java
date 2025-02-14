package Part12_AdvancedCodesRelatedToArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Code06_MinimizeTheMaximumDifferenceBetweenHeights {
    /*
    Input : arr[] = {1, 5, 15, 10} k = 3
    Output : Maximum difference is 8
    arr[] = {4, 8, 12, 7} and maximum   height – minimum height (12-4) = 8.

    We will solve using greedy technique
     */
    public static void main(String[] args) {
        int[] arr = { 1, 5, 15, 10 };
        int k = 3;
        int ans = getMinDiff(arr, arr.length, k);
        System.out.println("Minimum Difference: " + ans);
    }

    public static int getMinDiff(int[] arr, int n, int k) {
        if (n == 1) return 0; // Single element, no height difference

        Arrays.sort(arr); // Sort the array
        int minDiff = arr[n - 1] - arr[0]; // Initial max difference

        int min, max;

        for (int i = 0; i < n - 1; i++) {
            min = Math.min(arr[0] + k, arr[i + 1] - k);  // Try reducing higher values
            max = Math.max(arr[n - 1] - k, arr[i] + k);  // Try increasing smaller values

            if (min < 0) continue; // Skip invalid negative height values

            minDiff = Math.min(minDiff, max - min);
        }

        return minDiff;
    }
}