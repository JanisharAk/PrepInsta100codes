package Part05_importantCodesRelatedToArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Code120_SortAnArrayAccordingToTheOrderDefinedByAnotherArray {
    /*
    Input:
    Array 1: [2, 1, 2, 5, 3, 1, 4]
    Array 2: [2, 1, 3]
    Output:
    Sorted Array: [2, 2, 1, 1, 3, 5, 4]
     */
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 5, 3, 1, 4};
        int[] array2 = {2, 1, 3};

        // Sort array1 based on the order defined by array2
        int[] sortedArray = sortArrayByAnotherArray(array1, array2);

        // Print the result
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    public static int[] sortArrayByAnotherArray(int[] array1, int[] array2) {
        // Count occurrences of each element in array1
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : array1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Prepare the result list
        List<Integer> sortedList = new ArrayList<>();

        // Add elements from array2 in the defined order
        for (int num : array2) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                for (int i = 0; i < count; i++) {
                    sortedList.add(num);
                }
                countMap.remove(num); // Remove the processed element
            }
        }

        // Add remaining elements from array1 in sorted order
        List<Integer> remainingElements = new ArrayList<>();
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            for (int i = 0; i < count; i++) {
                remainingElements.add(num);
            }
        }
        remainingElements.sort(null); // Sort remaining elements
        sortedList.addAll(remainingElements);

        // Convert the result list back to an array
        return sortedList.stream().mapToInt(Integer::intValue).toArray();
    }
}
