package Part12_AdvancedCodesRelatedToArrays;

import java.util.Arrays;

public class Code09_MergeTwoSortedArraysWithoutUsingExtraSpace {
    /*
    int[] arr1 = {1, 4, 7, 8, 10};
    int[] arr2 = {2, 3, 9};

    output:
    Merged arr1: [1, 2, 3, 4, 7]
    Merged arr2: [8, 9, 10]
     */
    public static void merge(int[] arr1, int[] arr2, int n, int m) {
        int gap = (n + m) / 2 + (n + m) % 2;  // Calculate initial gap

        while (gap > 0) {
            int i = 0, j = gap;

            // Compare and swap in arr1
            while (j < n) {
                if (arr1[i] > arr1[j]) {
                    swap(arr1, i, j);
                }
                i++;
                j++;
            }

            // Compare and swap between arr1 and arr2
            j -= n;  // Reset j to start of arr2
            while (i < n && j < m) {
                if (arr1[i] > arr2[j]) {
                    swap(arr1, arr2, i, j);
                }
                i++;
                j++;
            }

            // Compare and swap in arr2
            i = 0;
            while (j < m) {
                if (arr2[i] > arr2[j]) {
                    swap(arr2, i, j);
                }
                i++;
                j++;
            }

            // Reduce gap
            gap = (gap > 1) ? (gap / 2 + gap % 2) : 0;
        }
    }

    // Swap function for same array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Swap function between two arrays
    private static void swap(int[] arr1, int[] arr2, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n = arr1.length, m = arr2.length;

        merge(arr1, arr2, n, m);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
}
