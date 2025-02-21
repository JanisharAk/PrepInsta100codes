package Part12_AdvancedCodesRelatedToArrays;

public class Code10_KadanesAlgorithm {
    //Kadane’s Algorithm == Maximum Subarray Sum

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;  // Include current element
            maxSum = Math.max(maxSum, currentSum);  // Update maxSum if needed
            if (currentSum < 0) currentSum = 0;  // Reset if sum becomes negative
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));  // Output: 6
    }
}
