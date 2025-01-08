package Part02_operationsOnString;

import java.util.Scanner;

public class Code37_PrintTheGivenStringInReverseOrder {
    /*
    abcd = dcba
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Initialize an empty string to store the reversed string
        String reversed = "";

        // Iterate through the string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i); // Append each character to the reversed string
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}
