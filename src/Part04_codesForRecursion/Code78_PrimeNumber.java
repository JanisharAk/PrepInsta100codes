package Part04_codesForRecursion;

import java.util.Scanner;

public class Code78_PrimeNumber {
    // we will use recursion here
    public static boolean isPrimeHelper(int n, int divisor) {
        // Base cases
        if (n <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        if (divisor == 1) {
            return true; // No divisors found, so it's prime
        }
        if (n % divisor == 0) {
            return false; // Found a divisor, so it's not prime
        }

        // Recursive case: Check the next divisor
        return isPrimeHelper(n, divisor - 1);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        return isPrimeHelper(n, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
