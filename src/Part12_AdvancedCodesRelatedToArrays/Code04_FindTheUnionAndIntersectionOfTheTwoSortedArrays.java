package Part12_AdvancedCodesRelatedToArrays;

import java.util.ArrayList;

public class Code04_FindTheUnionAndIntersectionOfTheTwoSortedArrays {
    // We will use two pointer conecpt here
    public static void findUnionAndIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> unionList = new ArrayList<>();
        ArrayList<Integer> intersectionList = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                unionList.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                unionList.add(arr2[j]);
                j++;
            } else { // Both are equal
                unionList.add(arr1[i]); // Add to Union
                intersectionList.add(arr1[i]); // Add to Intersection
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1 to union
        while (i < arr1.length) {
            unionList.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2 to union
        while (j < arr2.length) {
            unionList.add(arr2[j]);
            j++;
        }

        System.out.println("Union: " + unionList);
        System.out.println("Intersection: " + intersectionList);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        findUnionAndIntersection(arr1, arr2);
    }
}
