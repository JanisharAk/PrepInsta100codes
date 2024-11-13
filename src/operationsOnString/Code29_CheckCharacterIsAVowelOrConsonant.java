package operationsOnString;

import java.util.Scanner;

public class Code29_CheckCharacterIsAVowelOrConsonant {

    /*
    Input: 'A' → Output: "Vowel"
    Input: 'b' → Output: "Consonant"
    Input: '1' → Output: "Not an alphabet character"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char c = sc.next().charAt(0); // input for character

        // Check if the character is an alphabet letter
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            // Convert to lowercase for easy comparison
            char lowerCaseChar = Character.toLowerCase(c);

            /*
            Reason for converting to lower case is that
            By converting the character to lowercase, you only need to check against
            lowercase vowels (a, e, i, o, u), without writing separate conditions for
            uppercase vowels (A, E, I, O, U).
             */
            // Check if it's a vowel
            if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Not an alphabet character");
        }
    }
}
