package Part02_operationsOnString;

import java.util.Scanner;


public class Code38_RemoveAllCharactersFromStringExceptAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Using StringBuilder to store only alphabets
        StringBuilder result = new StringBuilder();

        // Iterate through each character of the input string
        for (char c : input.toCharArray()) {
            // Check if the character is an alphabet (uppercase or lowercase)
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                result.append(c);
            }
        }

        // Print the resulting string with only alphabets
        System.out.println("String with only alphabets: " + result.toString());
    }
}
