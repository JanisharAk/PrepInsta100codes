package workingwithNumbers;

import java.util.Scanner;

public class Code66_ReplaceAllZerpWithOneInAGivenInteger {

    // Method to replace all 0's with 1's in a given integer
    public static int replaceZeroWithOne(int number) {
        if (number == 0) {
            return 1; // Special case: if the number is 0, return 1
        }

        int result = 0;
        int place = 1;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                digit = 1;
            }
            result += digit * place;
            place *= 10;
            number /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Take user input

        int modifiedNumber = replaceZeroWithOne(number);

        System.out.println("Modified number: " + modifiedNumber);

        scanner.close(); // Close the scanner to release resources
    }
}
