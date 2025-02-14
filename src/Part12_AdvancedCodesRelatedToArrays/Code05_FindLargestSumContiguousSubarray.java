package Part12_AdvancedCodesRelatedToArrays;

public class Code05_FindLargestSumContiguousSubarray {
    /*
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    output: The contiguous subarray [4, -1, 2, 1] has the maximum sum = 6.

    Largest Sum Contiguous Subarray using a two-pointer approach, but it’s not the
    most efficient way compared to Kadane’s Algorithm.

    We will use Kadane’s Algorithm here.
     */
    public static void maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart; // Update start index
                end = i;           // Update end index
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1; // Move start index forward
            }
        }

        System.out.println("Maximum Sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
    }
}
