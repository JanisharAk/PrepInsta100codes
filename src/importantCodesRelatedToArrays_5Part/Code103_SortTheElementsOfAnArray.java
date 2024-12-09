package importantCodesRelatedToArrays_5Part;

import java.util.Arrays;
import java.util.Scanner;

public class Code103_SortTheElementsOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Array initialization and input
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array using brute-force (selection sort)
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Printing the sorted array
        System.out.println("Array after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


        // now we will use sort method to sort it
//        Arrays.sort(arr);
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
