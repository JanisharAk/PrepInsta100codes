package importantCodesRelatedToArrays_5Part;

import java.util.Arrays;
import java.util.Scanner;

public class Code102_SortFirstHalfInAscendingOrderAndSecondHalfInDescending {
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

        // Sorting logic
        int mid = n / 2;

        // Sort the first half in ascending order
        Arrays.sort(arr, 0, mid);

        // Sort the second half in descending order
        Arrays.sort(arr, mid, n);
        for (int i = mid, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Printing the sorted array
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
