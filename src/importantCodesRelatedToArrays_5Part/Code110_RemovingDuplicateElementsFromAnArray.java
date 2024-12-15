package importantCodesRelatedToArrays_5Part;

import java.util.Arrays;

public class Code110_RemovingDuplicateElementsFromAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 10};
        removeDuplicateElement(arr);
    }

    public static void removeDuplicateElement(int[] arr) {
        // Iterate through the array
        int n = arr.length;
        if (n == 0) return; // If array is empty, do nothing

        int newLength = n; // Track the new length after removing duplicates

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if current element is equal to any future element
                if (arr[i] == arr[j]) {
                    // Replace duplicate element with the last element of the array
                    arr[j] = arr[n - 1];
                    // Decrease the array size for the next iteration
                    n--;
                    j--; // Recheck the new element at position j
                }
            }
        }

        // Print the unique elements
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
