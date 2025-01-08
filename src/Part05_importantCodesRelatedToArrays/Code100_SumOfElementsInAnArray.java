package Part05_importantCodesRelatedToArrays;

import java.util.Scanner;

public class Code100_SumOfElementsInAnArray {
    // { 2, 4, 6} = 12
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.print("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
