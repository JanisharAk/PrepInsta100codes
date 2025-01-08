package Part05_importantCodesRelatedToArrays;

import java.util.ArrayList;
import java.util.List;

public class Code122_FindingEquilibriumIndexOfAnArray {
    /*
    For the array { -7, 1, 5, 2, -4, 3, 0 }:
    Total sum = 0
    Equilibrium indices: [3, 6]
     */
    public static List<Integer> findEquilibriumIndices(int[] arr) {
        List<Integer> equilibriumIndices = new ArrayList<>();
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // Iterate through the array to find equilibrium indices
        for (int i = 0; i < arr.length; i++) {
            // Total sum excluding the current element (right sum)
            int rightSum = totalSum - leftSum - arr[i];

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                equilibriumIndices.add(i);
            }

            // Update the left sum
            leftSum += arr[i];
        }

        return equilibriumIndices;
    }

    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        List<Integer> indices = findEquilibriumIndices(arr);

        if (indices.isEmpty()) {
            System.out.println("No equilibrium index found.");
        } else {
            System.out.println("Equilibrium indices: " + indices);
        }
    }
}
