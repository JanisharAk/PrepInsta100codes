package workingwithNumbers;

import java.util.Scanner;

public class Code67_CanANumberBeExpressedAsASumOfTwoPrimeNumbers {
    /*
    Can a number be expressed as a sum of two prime numbers
    Input:34
    Output: 34=3+31, 34=17+17
     */

    public static void main(String[] args) {
        int n = 34; // Replace with your number
        if (canBeExpressedAsSumOfTwoPrimes(n)) {
            System.out.println(n + " can be expressed as a sum of two prime numbers.");
        } else {
            System.out.println(n + " cannot be expressed as a sum of two prime numbers.");
        }
    }

    public static boolean canBeExpressedAsSumOfTwoPrimes(int n) {
        // Numbers less than 2 cannot be expressed as a sum of two primes
        if (n < 2) return false;

        // Iterate through all numbers from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            // Check if both numbers are prime
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                return true;
            }
        }
        return false;
    }

    public static boolean isPrime(int num) {
        // Numbers less than 2 are not prime
        if (num < 2) return false;

        // Check divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
}
}
