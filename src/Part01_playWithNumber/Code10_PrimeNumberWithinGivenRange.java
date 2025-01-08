package Part01_playWithNumber;

import java.util.Scanner;

public class Code10_PrimeNumberWithinGivenRange {

    /*
    We have to find prime numbers within a given range.
    A prime number is only divisible by two numbers: 1 and itself.
    For each number in the range, we check if it has exactly two divisors.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int range1 = sc.nextInt();
        System.out.print("Enter the last range: ");
        int range2 = sc.nextInt();

        System.out.println("Prime numbers between " + range1 + " and " + range2 + " are:");

        for (int i = range1; i <= range2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int count = 0;

        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                count++;
            }
        }

        return count == 2; // Only prime numbers have exactly two divisors: 1 and itself
    }
}
