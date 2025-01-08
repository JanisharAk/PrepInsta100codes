package Part04_codesForRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code94_GivenASetOfPositiveIntegersFindAllItsSubsets {
    /*
    Input: Set: {1, 2, 3}
    Output:All subsets:
[]
[1]
[1, 2]
[1, 2, 3]
[1, 3]
[2]
[2, 3]
[3]
     */


    // Recursive function to generate all subsets
    public static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: if index equals the size of nums, add the current subset to the result
        if (index == nums.length) {
            result.add(new ArrayList<>(current)); // Add a copy of the current subset
            return;
        }

        // Recursive case: Include the current element
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        // Backtrack: Exclude the current element
        current.remove(current.size() - 1);
        generateSubsets(nums, index + 1, current, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the set: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements of the set separated by spaces: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);

        System.out.println("All subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
