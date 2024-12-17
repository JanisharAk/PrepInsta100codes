package importantCodesRelatedToArrays_5Part;

import java.util.Arrays;

public class Code119_FindingMinimumSumOfAbsoluteDifferenceOfGivenArray {
    /*
    Sort the array: [1, 2, 3]
    Compute the sum of absolute differences:
    ∣2−1∣+∣3−2∣=1+1=2
     */
    public static void main(String[] args) {
        int[] arr = {1,3,2,6};

        //sort the array first
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum +=arr[i]  - arr[i-1];
        }
        System.out.println("Sum of the absolute difference of given array: "+ sum);
    }
}

