package importantCodesRelatedToArrays_5Part;

import java.util.HashSet;
import java.util.Scanner;

public class Code107_CountingDistinctElementsInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int distinctCount = countDistinctElements(array);

        System.out.println("Number of distinct elements: " + distinctCount);

        scanner.close();
    }

    public static int countDistinctElements(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            set.add(num);
        }

        return set.size();
    }

}
