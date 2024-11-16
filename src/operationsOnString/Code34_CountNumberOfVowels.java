package operationsOnString;

import java.util.Scanner;

public class Code34_CountNumberOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Convert string to lowercase to handle uppercase vowels and
        // apply condition on lowerase vowel
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int count = 0; // Store the count of vowels here

        for (int i = 0; i < ch.length; i++) {
            // Check if the character is a vowel
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            }
        }

        // Print the final count
        System.out.println("Number of vowels: " + count);
    }
}
