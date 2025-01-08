package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code74_FindingNumberOfTimesXDigitOccursInAGivenInput {
    /*
Input:
Enter a number: 1122334455
Enter the digit to count: 3
Output:
The digit 3 occurs 2 times in 1122334455
     */

    public static int countDigitOccurrences(int number, int digit) {
        // Convert the number to a string
        String numberStr = String.valueOf(number);
        // Convert the digit to a character
        char digitChar = Character.forDigit(digit, 10);

        // Initialize a counter
        int count = 0;

        // Loop through each character in the number string
        for (char c : numberStr.toCharArray()) {
            // Check if the current character matches the digit
            if (c == digitChar) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Prompt the user for the digit
        System.out.print("Enter the digit to count: ");
        int digit = scanner.nextInt();

        // Validate the digit input
        if (digit < 0 || digit > 9) {
            System.out.println("Please enter a valid digit (0-9).");
            return;
        }

        // Count the occurrences of the digit
        int occurrences = countDigitOccurrences(number, digit);

        // Display the result
        System.out.println("The digit " + digit + " occurs " + occurrences + " times in " + number);

        // Close the scanner
        scanner.close();
    }
}
