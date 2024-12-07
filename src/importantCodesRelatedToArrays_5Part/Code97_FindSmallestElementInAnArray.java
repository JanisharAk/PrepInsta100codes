package importantCodesRelatedToArrays_5Part;

import java.util.Scanner;

public class Code97_FindSmallestElementInAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt(); // Read each element;
        }

        //define the lowestElement
        int smallestElement = arr[0];

        // Traverse the array to find the largest element
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallestElement) {
                smallestElement = arr[i]; // Update largest element
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + smallestElement);

    }
}
