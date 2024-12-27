package AdvancedCodesRelatedToArrays_06Part;

public class Code01_SortTheArrayWithoutUsingAnyAlgorithm {
    //Given an array which consists of only 0, 1 and 2.
    // Sort the array without using any  algorithm

    // Initialize three pointers
    public void sortColors(int[] nums) {
        // Initialize three pointers
        int low = 0, mid = 0, high = nums.length - 1;

        // Traverse through the array
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], then move both low and mid pointers
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If the element is 1, just move the mid pointer forward
                mid++;
            } else {
                // If the element is 2, swap nums[mid] and nums[high], then move high pointer backward
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    // Helper method to test the code
    public static void main(String[] args) {
        Code01_SortTheArrayWithoutUsingAnyAlgorithm solution = new Code01_SortTheArrayWithoutUsingAnyAlgorithm();
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        System.out.println("Sorted array 1: " + java.util.Arrays.toString(nums1)); // [0, 0, 1, 1, 2, 2]

        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);
        System.out.println("Sorted array 2: " + java.util.Arrays.toString(nums2)); // [0, 1, 2]
    }
}
