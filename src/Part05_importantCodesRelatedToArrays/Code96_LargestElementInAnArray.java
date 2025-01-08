package Part05_importantCodesRelatedToArrays;

import java.util.Scanner;

public class Code96_LargestElementInAnArray {

    public static void main(String[] args) {
        /*
        Enter the size of the array: 4
        Enter the elements of the array:
        3 5 4 2
        The largest element in the array is: 5
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();  // Read the size of the array
        int[] arr = new int[n]; // Create the array

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // Read each element
        }

        // Initialize the largest element as the first element
        int largest = arr[0];

        // Traverse the array to find the largest element
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest element
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}
