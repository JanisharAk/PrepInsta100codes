package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code75_FindingNumberOfIntegersWhichHasExactlyXDivisors {
    /*
    Input:
Enter the range (n): 20
Enter the exact number of divisors (x): 4
Output:
The number of integers with exactly 4 divisors is: 6
     */
    // Function to count the divisors of a number
    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    count++; // Perfect square contributes only one divisor
                } else {
                    count += 2; // Count both divisors
                }
            }
        }
        return count;
    }

    // Function to find numbers with exactly x divisors
    public static int findNumbersWithXDivisors(int n, int x) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (countDivisors(i) == x) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range (n) and exact number of divisors (x)
        System.out.print("Enter the range: ");
        int n = scanner.nextInt();

        System.out.print("Enter the exact number of divisors (x): ");
        int x = scanner.nextInt();

        // Find and print the count of numbers with exactly x divisors
        int count = findNumbersWithXDivisors(n, x);
        System.out.println("The number of integers with exactly " + x + " divisors is: " + count);

        scanner.close();
    }
}
