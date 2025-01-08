package Part02_operationsOnString;

import java.util.ArrayList;
import java.util.Collections;

public class Code50_PrintAllPermutationsOfaGivenStringInLexicographicallySortedOrder {
    /*
Input:
str = "ABC"

Output:
Lexicographically sorted permutations:
ABC
ACB
BAC
BCA
CAB
CBA
     */
    public static void main(String[] args) {
        String input = "ABC";

        // List to store all permutations
        ArrayList<String> permutations = new ArrayList<>();

        // Generate all permutations
        generatePermutations(input, 0, input.length() - 1, permutations);

        // Sort permutations lexicographically
        Collections.sort(permutations);

        // Print the sorted permutations
        System.out.println("Lexicographically sorted permutations:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    // Function to generate all permutations using backtracking
    public static void generatePermutations(String str, int left, int right, ArrayList<String> permutations) {
        if (left == right) {
            permutations.add(str); // Add the permutation to the list
        } else {
            for (int i = left; i <= right; i++) {
                // Swap characters at positions left and i
                str = swap(str, left, i);

                // Recur with the next character fixed
                generatePermutations(str, left + 1, right, permutations);

                // Backtrack (restore the string)
                str = swap(str, left, i); // undo the swap
            }
        }
    }

    // Function to swap characters in a string
    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}
