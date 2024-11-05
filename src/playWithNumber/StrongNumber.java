package playWithNumber;

import java.util.Scanner;

public class StrongNumber {

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNumber = num;

        while (num > 0) {
            int digit = num % 10;          // Get the last digit
            sum += factorial(digit);       // Add factorial of the digit to sum
            num /= 10;                     // Remove the last digit
        }

        return sum == originalNumber;      // Check if sum is equal to the original number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isStrongNumber(number)) {
            System.out.println("Yes, it's a strong number");
        } else {
            System.out.println("No, it's not a strong number");
        }
    }
}
/*
Enter a number: 145
Yes, it's a strong number

 */