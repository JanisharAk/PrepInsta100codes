package importantCodesRelatedToArrays_5Part;

import java.util.Scanner;

public class Code98_SmallestAndLargestElementInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input: Elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize smallest and largest with the first element
        int smallest = arr[0];
        int largest = arr[0];

        // Traverse the array to find smallest and largest
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Output the results
        System.out.println("The smallest element in the array is: " + smallest);
        System.out.println("The largest element in the array is: " + largest);
    }
}
