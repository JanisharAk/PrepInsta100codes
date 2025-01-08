package Part02_operationsOnString;

import java.util.Scanner;

public class Code33_ToggleEachCharacterInAString {
    /*
   Toggle each character in a string
   convert lowercase letters to uppercase and vice versa
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // Reading input string

        // Convert the string to a char array
        char[] ch = s.toCharArray();

        // Toggle each character by adjusting ASCII value
        for (int i = 0; i < ch.length; i++) {
            // If the character is a letter, toggle its case by adding or subtracting 32
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] -= 32;  // Convert lowercase to uppercase
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;  // Convert uppercase to lowercase
            }
        }

        // Print the toggled string
        System.out.println(new String(ch));
    }
}
