package operationsOnString;

import java.util.Scanner;

public class Code41_CountTheSumOfNumbersInAString {
    /*
    "abc12def34gh5" = 51
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine(); // Input string

        int sum = 0; // To store the total sum of numbers
        int currentNumber = 0; // To accumulate the current number

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // If the character is a digit, accumulate it into currentNumber
                currentNumber = currentNumber * 10 + (c - '0');
            } else {
                // If the character is not a digit, add the current number to the sum
                sum += currentNumber;
                currentNumber = 0; // Reset the currentNumber for the next number
            }
        }

        // Add the last accumulated number (if any) to the sum
        sum += currentNumber;

        System.out.println("The sum of numbers in the string is: " + sum);
    }
}
