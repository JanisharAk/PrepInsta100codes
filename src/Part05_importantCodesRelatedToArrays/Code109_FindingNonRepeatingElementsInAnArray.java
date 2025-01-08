package Part05_importantCodesRelatedToArrays;

import java.util.HashSet;

public class Code109_FindingNonRepeatingElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 5, 8, 9};
        findNonRepeatingElements(arr);
    }

    public static void findNonRepeatingElements(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> nonDuplicates = new HashSet<>();
        /*
        seen: Tracks all elements that have been encountered in the array so far.
              It includes duplicates.
        nonDuplicates: Stores elements that appear exactly once in the array.

         */

        for (int num : arr) {
            // If the number has already been seen, remove it from nonDuplicates
            if (seen.contains(num)) {
                nonDuplicates.remove(num);
            } else {
                // Add the number to both sets
                seen.add(num);
                nonDuplicates.add(num);
            }
        }

        // Display the non-repeating elements
        System.out.println("Non-repeating elements: " + nonDuplicates);
    }
}
