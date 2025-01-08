package Part04_codesForRecursion;

import java.util.Scanner;

public class Code81_ReversingANumber {
    // Helper function for recursion
    public static int reversingANumber(int n, int reversed) {
        // Base case: if n becomes 0, return the reversed number
        if (n == 0) {
            return reversed;
        }

        // Recursive step: append the last digit of n to reversed
        reversed = reversed * 10 + (n % 10);
        return reversingANumber(n / 10, reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Call the helper function with initial reversed as 0
        int reversedNumber = reversingANumber(n, 0);
        System.out.print("Reversed number: " + reversedNumber);
    }
}
