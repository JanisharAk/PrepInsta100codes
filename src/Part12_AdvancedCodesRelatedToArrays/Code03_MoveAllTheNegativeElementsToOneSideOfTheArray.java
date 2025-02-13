package Part12_AdvancedCodesRelatedToArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Code03_MoveAllTheNegativeElementsToOneSideOfTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,-6,7,-9,5};

        //Method 1 using sorting
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }


        // Method 2: Using Two Pointer Approach
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0) {
                left++; // Already in correct position
            } else if (arr[right] > 0) {
                right--; // Already in correct position
            } else {
                // Swap elements
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        // Print the rearranged array
        System.out.println("Array after moving negative elements:");
        System.out.println(Arrays.toString(arr));
    }
}
