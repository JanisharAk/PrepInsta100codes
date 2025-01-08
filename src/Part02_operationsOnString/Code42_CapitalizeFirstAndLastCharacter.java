package Part02_operationsOnString;

import java.util.Scanner;

public class Code42_CapitalizeFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine(); // Input string

        // Split the input string into words
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        // Process each word
        for (String word : words) {
            if (word.length() == 1) {
                // If the word has only one character, manually convert to uppercase
                char first = toUpperCase(word.charAt(0));
                result.append(first).append(" ");
            } else {
                // Manually capitalize the first and last character
                char first = toUpperCase(word.charAt(0));
                char last = toUpperCase(word.charAt(word.length() - 1));

                // Append first character
                result.append(first);

                // Append middle characters (if any)
                for (int i = 1; i < word.length() - 1; i++) {
                    result.append(word.charAt(i));
                }

                // Append last character
                result.append(last).append(" ");
            }
        }

        // Remove the trailing space and print the result
        System.out.println("Output: " + result.toString().trim());
    }

    // Method to manually convert a character to uppercase
    private static char toUpperCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) (c - 32); // Convert lowercase to uppercase using ASCII
        }
        return c; // Return unchanged if it's already uppercase or not a letter
    }
}
