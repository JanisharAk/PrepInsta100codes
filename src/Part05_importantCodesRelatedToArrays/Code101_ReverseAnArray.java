package Part05_importantCodesRelatedToArrays;

import java.util.Scanner;

public class Code101_ReverseAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        // Input: Elements of the array
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Reverse the array
        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
