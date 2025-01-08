package Part02_operationsOnString;

import java.util.Scanner;

public class Code45_CheckIfTwoStringsAreAnagramOrNot {
    /*
    Two words are anagrams of each other if they contain the same number
    of characters and the same characters.
    Input: listen and silent
    Yes anagram
    Hello and world are not anagram.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams");
            return;
        }

        // Frequency array for 26 lowercase letters
        int[] frequency = new int[26];

        // Count frequency of characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i) - 'a']++;
        }

        // Subtract frequency of characters in the second string
        for (int i = 0; i < str2.length(); i++) {
            frequency[str2.charAt(i) - 'a']--;
        }

        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                System.out.println("Given string is not anagram");
                return;
            }
        }

        System.out.println("Given string is Anagram");
    }
}
