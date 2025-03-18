package Part12_AdvancedCodesRelatedToArrays;

import java.util.HashSet;

public class Code14_FindAllPairsOnIntegerArrayWhoseSumIsEqualToGivenNumber {
    /*
Input:
    nums = [1, 2, 3, 4, 5, 6]
    target = 7
Output:
    (1,6), (2,5), (3,4)
     */
    public static void findPairs(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 7;
        findPairs(nums, target);
    }
}