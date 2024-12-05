package codesForRecursion;

import java.util.ArrayList;
import java.util.List;

public class Code87_PrintSumsOfAllSubsetsInIt {
    // Recursive function to find all subset sums
    public static void findSubsetSums(int[] arr, int index, int currentSum, List<Integer> result) {
        // Base case: if we have processed all elements
        if (index == arr.length) {
            result.add(currentSum); // Add the current subset sum to the result list
            return;
        }

        // Exclude the current element and move to the next
        findSubsetSums(arr, index + 1, currentSum, result);

        // Include the current element in the sum and move to the next
        findSubsetSums(arr, index + 1, currentSum + arr[index], result);
    }

    public static List<Integer> subsetSums(int[] arr) {
        List<Integer> result = new ArrayList<>();
        findSubsetSums(arr, 0, 0, result); // Start the recursion with initial sum 0
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Input array
        List<Integer> result = subsetSums(arr); // Get the subset sums
        System.out.println("Sums of all subsets: " + result);
    }
}
