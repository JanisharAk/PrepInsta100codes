package operationsOnString;

import java.util.Scanner;

public class Code44_FindNonRepeatingCharactersInString {
    /*
    Input: "absa"
    Output: Non-repeating characters: b s
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Handle string in lowercase
        s = s.toLowerCase();

        // Array to store frequency of each character
        int[] frequency = new int[256]; // Covers all ASCII characters

        // First pass: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequency[c]++;
        }

        // Second pass: Identify and print non-repeating characters
        System.out.print("Non-repeating characters: ");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequency[c] == 1) {
                System.out.print(c + "");
            }
        }
    }
}
