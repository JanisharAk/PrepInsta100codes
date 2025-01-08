package Part04_codesForRecursion;

import java.util.Scanner;

public class Code95_RemoveAllItsAdjacentDuplicateCharacters {
    /*
    Input: Enter a string: abbaca
    Output 1: String after removing adjacent duplicates: ca
     */

    public static String removeAdjacentDuplicates(String str) {
        // Base case: if the string is empty or has only one character
        if (str.length() <= 1) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        boolean hasAdjacent = false;

        for (int i = 0; i < str.length(); i++) {
            // Check if current character is the same as the next character
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                hasAdjacent = true;
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    i++; // Skip all adjacent duplicates
                }
            } else {
                result.append(str.charAt(i)); // Add non-duplicate characters
            }
        }

        // If no adjacent duplicates were found, return the result
        if (!hasAdjacent) {
            return result.toString();
        }

        // Recursively call the function on the resulting string
        return removeAdjacentDuplicates(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeAdjacentDuplicates(input);
        System.out.println("String after removing adjacent duplicates: " + result);
    }
}
