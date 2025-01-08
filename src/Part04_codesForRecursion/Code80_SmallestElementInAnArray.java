package Part04_codesForRecursion;

import java.util.Scanner;

public class Code80_SmallestElementInAnArray {
    public static int smallestElementInAnArray(int[] arr, int n) {
        // Base case: if the array has only one element
        if (n == 1) {
            return arr[0];
        }

        // Recursive call: find the smallest in the rest of the array
        int minInRest = smallestElementInAnArray(arr, n - 1);

        // Compare the last element with the smallest in the rest
        return Math.min(minInRest, arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();

        // Initialize and populate the array
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print the smallest element
        int smallest = smallestElementInAnArray(arr, n);
        System.out.print("The smallest element in the array is: " + smallest);
    }
}
