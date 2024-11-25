package workingwithNumbers;

import java.util.Scanner;

public class Code71_CalculateTheNumberOfDigitsInAnInteger {
    /*
    Calculate the number of digits in an integer
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = Math.abs(num); // Handle negative numbers

        while (temp > 0) {
            temp /= 10; // Remove the last digit
            count++;    // Increment the digit count
        }

        if (num == 0) {
            count = 1; // Special case for 0
        }

        System.out.println("The number " + num + " has " + count + " digit");
    }
}
