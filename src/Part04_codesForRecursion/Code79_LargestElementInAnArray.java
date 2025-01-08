package Part04_codesForRecursion;

import java.util.Scanner;

public class Code79_LargestElementInAnArray {
    public static int findLargest(int[] arr, int n) {
        // Base case: if the array has only one element
        if (n == 1) {
            return arr[0];
        }

        // Recursive call: find the largest in the rest of the array
        int maxInRest = findLargest(arr, n - 1);

        // Compare the last element with the largest in the rest
        return Math.max(maxInRest, arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Populate the array
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the largest element
        int largest = findLargest(arr, arr.length);
        System.out.println("The largest element in the array is: " + largest);
    }
}
