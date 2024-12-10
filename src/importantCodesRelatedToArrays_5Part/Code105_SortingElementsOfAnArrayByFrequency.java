package importantCodesRelatedToArrays_5Part;

import java.util.*;

public class Code105_SortingElementsOfAnArrayByFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size and elements of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Map to store frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Convert the array to a List for custom sorting
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Sort based on frequency and value
        list.sort((a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA == freqB) {
                return Integer.compare(a, b); // Sort by value in case of tie
            }
            return Integer.compare(freqB, freqA); // Sort by frequency
        });

        // Output the sorted array
        System.out.println("Array sorted by frequency:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
