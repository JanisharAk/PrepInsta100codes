package Part12_AdvancedCodesRelatedToArrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Code02_FindTheKthMaxAndMinElementOfAnArray {
    /*
    Kth smallest element is:
    2
    Kth Largest element is:
    2
     */
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5, 6, 6, 7};
        int k = 3;

        // 1. Sort the array
        Arrays.sort(arr);

        // 2. Kth position from the end (for largest)
        int kthPositionFromEnd = arr.length - k;


        // 3 & 4. Find the element at the kth position from the end.
        if (k > 0 && k <= arr.length) { // Check for valid k
            int kthLargest = arr[kthPositionFromEnd];
            System.out.println("Kth Largest: " + kthLargest);
        }

        // Find Kth Smallest (similar logic, but from the beginning)
        int kthSmallest;
        if (k > 0 && k <= arr.length) {
            kthSmallest = arr[k - 1]; // Kth smallest is at index k-1
            System.out.println("Kth Smallest: " + kthSmallest);
        }
    }
}
