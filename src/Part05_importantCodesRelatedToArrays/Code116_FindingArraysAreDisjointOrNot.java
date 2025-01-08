package Part05_importantCodesRelatedToArrays;

import java.util.HashSet;

public class Code116_FindingArraysAreDisjointOrNot {
    // If two arrays do not have any elements in common, they are disjoint.
    public static boolean findDisjointOrNot(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Add elements of the first array to set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Add elements of the second array to set2
        for (int num : arr2) {
            set2.add(num);
        }

        // Find the intersection of both sets
        set1.retainAll(set2);

        // If the intersection is empty, the arrays are disjoint
        return set1.isEmpty();
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 2, 5};
        int arr2[] = {3, 6, 7, 8, 9};
        System.out.println(findDisjointOrNot(arr1, arr2)); // should print true since arrays are disjoint
    }
}
