package Part05_importantCodesRelatedToArrays;

import java.util.Scanner;

public class Code99_SecondSmallestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Validate input
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        // Input: Elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize smallest and second smallest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                // Update both smallest and second smallest
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                // Update only second smallest
                secondSmallest = arr[i];
            }
        }

        // Check if second smallest exists
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element in the array.");
        } else {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        }
    }
}
