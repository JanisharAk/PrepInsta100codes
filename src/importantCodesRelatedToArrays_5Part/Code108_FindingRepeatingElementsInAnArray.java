package importantCodesRelatedToArrays_5Part;

import java.util.HashMap;
import java.util.HashSet;

public class Code108_FindingRepeatingElementsInAnArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 5, 8, 9};
        findRepeatingElements(arr);
    }

    public static void findRepeatingElements(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) { // If adding fails, it's a duplicate
                duplicates.add(num);
            }
        }

        System.out.println("Repeating elements: " + duplicates);
    }
}