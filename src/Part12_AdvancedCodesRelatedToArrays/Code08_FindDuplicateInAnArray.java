package Part12_AdvancedCodesRelatedToArrays;

import java.util.HashSet;

public class Code08_FindDuplicateInAnArray {
    //We use hashSet for time complexity o(n)
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }
}
