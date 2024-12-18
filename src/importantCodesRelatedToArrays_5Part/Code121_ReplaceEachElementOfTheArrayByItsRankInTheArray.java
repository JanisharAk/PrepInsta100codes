package importantCodesRelatedToArrays_5Part;

import java.util.Arrays;
import java.util.HashMap;

public class Code121_ReplaceEachElementOfTheArrayByItsRankInTheArray {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Get the rank array
        int[] rankedArray = replaceWithRank(arr);

        // Print the result
        System.out.println("Ranked Array: " + Arrays.toString(rankedArray));
    }

    public static int[] replaceWithRank(int[] arr) {
        // Create a copy of the array and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Map each element to its rank
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Replace each element in the original array with its rank
        int[] rankedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rankedArr[i] = rankMap.get(arr[i]);
        }

        return rankedArr;}
}
