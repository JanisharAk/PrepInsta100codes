package Part05_importantCodesRelatedToArrays;

public class Code117_DetermineArrayIsSubsetOfAnotherArrayOrNot {
    public static void main(String[] args) {
        // Define the arrays
        int[] arr1 = {2, 3, 4}; // First array
        int[] arr2 = {1, 2, 3, 4, 5}; // Second array

        int temp = 0; // Counter to track matching elements

        // Check for matches between arr1 and arr2
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    temp++; // Increment counter when a match is found
                    break; // Stop searching in arr2 once a match is found
                }
            }
        }

        // Check if arr1 is a subset of arr2
        if (temp == arr1.length) {
            System.out.println("arr1 is a subset of arr2.");
        } else {
            System.out.println("arr1 is not a subset of arr2.");
        }
    }
}
/*
you can compare temp with the length of arr1. If temp equals the length of arr1,
It means all elements of arr1 are present in arr2, and thus arr1 is a subset of arr2.
 */