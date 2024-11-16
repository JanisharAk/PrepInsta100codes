package operationsOnString;

import java.util.Scanner;

public class Code35_RemoveTheVowelsFromAString {
    /*
    Abcde = bcd
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Use a StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Check if the character is not a vowel (case-insensitive)
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result.append(ch); // Append non-vowel characters
            }
        }

        System.out.println("String after removing vowels: " + result.toString());
    }
}
