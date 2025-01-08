package Part05_importantCodesRelatedToArrays;

import java.util.Scanner;

public class Code115_FindMaximumProductSubArray {
    /*
    Input: nums = [2, 3, -2, 4, -1]
    Output: Maximum Product Subarray: 48

    Input: nums = [-2, 0, -1]
    Output: Maximum Product Subarray: 0

    Input: nums = [-1, -3, -10, 0, 60]
    Output: Maximum Product Subarray: 60
     */

    public static int findMaxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle empty array case
        }

        // Initialize the maxProduct, minProduct, and result
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // If the current number is negative, swap maxProduct and minProduct
            if (current < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct
            maxProduct = Math.max(current, maxProduct * current);
            minProduct = Math.min(current, minProduct * current);

            // Update result to store the maximum product found so far
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Call the function to find the maximum product subarray
        int result = findMaxProduct(arr);
        System.out.println("Maximum Product Subarray: " + result);
    }
}
