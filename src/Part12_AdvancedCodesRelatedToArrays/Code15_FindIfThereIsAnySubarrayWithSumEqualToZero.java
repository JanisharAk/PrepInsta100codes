package Part12_AdvancedCodesRelatedToArrays;

import java.util.HashSet;

public class Code15_FindIfThereIsAnySubarrayWithSumEqualToZero {

    public static boolean hasSubarrayWithZeroSum(int[] nums) {
        HashSet<Integer> prefixSums = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            sum += num; // Compute prefix sum

            // If prefix sum is 0 or it was seen before, subarray exists
            if (sum == 0 || prefixSums.contains(sum)) {
                return true;
            }

            // Store the prefix sum
            prefixSums.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, -3, 1, 6};
        System.out.println(hasSubarrayWithZeroSum(nums)); // Output: true

        int[] nums2 = {1, 2, 3};
        System.out.println(hasSubarrayWithZeroSum(nums2)); // Output: false

        int[] nums3 = {-3, 2, 3, 1, 6};
        System.out.println(hasSubarrayWithZeroSum(nums3)); // Output: true
    }
}
