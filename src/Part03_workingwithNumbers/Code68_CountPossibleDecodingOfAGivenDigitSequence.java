package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code68_CountPossibleDecodingOfAGivenDigitSequence {
    /*
    Input: Enter the digit sequence: 123
    Output:Number of possible decodings: 3
     */

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the digit sequence
        System.out.print("Enter the digit sequence: ");
        String digits = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Compute the number of decodings
        int count = countDecodings(digits);

        // Output the result
        System.out.println("Number of possible decodings: " + count);
    }

    // Function to count decodings
    public static int countDecodings(String digits) {
        // If the input is empty or starts with '0', it can't be decoded
        if (digits == null || digits.length() == 0 || digits.charAt(0) == '0') {
            return 0;
        }
        return countDecodingsHelper(digits, 0);
    }

    // Helper recursive function
    private static int countDecodingsHelper(String digits, int index) {
        // Base case: If we reach the end of the string, there's one valid decoding
        if (index == digits.length()) {
            return 1;
        }

        // If the current digit is '0', it can't be decoded
        if (digits.charAt(index) == '0') {
            return 0;
        }

        // Count decodings by taking one digit
        int count = countDecodingsHelper(digits, index + 1);

        // Count decodings by taking two digits, if valid
        if (index < digits.length() - 1) {
            int twoDigitNumber = Integer.parseInt(digits.substring(index, index + 2));
            if (twoDigitNumber >= 10 && twoDigitNumber <= 26) {
                count += countDecodingsHelper(digits, index + 2);
            }
        }
        return count;
    }
}
