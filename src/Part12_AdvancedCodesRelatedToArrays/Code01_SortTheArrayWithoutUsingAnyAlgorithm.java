package Part12_AdvancedCodesRelatedToArrays;

import java.util.Arrays;

public class Code01_SortTheArrayWithoutUsingAnyAlgorithm {

    public static void insertionSort(int[] arr) { // Make the method static
        if (arr == null || arr.length <= 1) { // Handle null or empty arrays
            return; // Nothing to sort
        }

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4};
        insertionSort(arr);
        System.out.println("Sorted array (Insertion Sort): " + Arrays.toString(arr));

        int[] arr2 = {1, 4, 1, 2, 7, 5, 2}; // Example with duplicates
        insertionSort(arr2);
        System.out.println("Sorted array (Insertion Sort with duplicates): " + Arrays.toString(arr2));

        }
}