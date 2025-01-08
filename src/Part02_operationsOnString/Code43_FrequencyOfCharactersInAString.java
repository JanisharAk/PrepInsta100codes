package Part02_operationsOnString;

import java.util.Scanner;

public class Code43_FrequencyOfCharactersInAString {
    /*
    Input : Absaba
    Output: A:3 b:2 s:1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.toLowerCase(); // Convert to lowercase to handle case insensitivity

        // Array to store frequency of characters (assuming only English alphabets)
        int[] frequency = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') { // Ensure only alphabets are counted
                frequency[c - 'a']++; //If c is 'a', c - 'a' = 97 - 97 = 0.
                                      //If c is 'b', c - 'a' = 98 - 97 = 1.
            }
        }
        // Display the frequency of characters
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Print only characters with non-zero frequency
                System.out.println((char) (i + 'a') + ": " + frequency[i]);
            }
        }
    }
}
