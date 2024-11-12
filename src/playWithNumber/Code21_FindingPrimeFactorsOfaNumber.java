package playWithNumber;

import java.util.Scanner;

public class Code21_FindingPrimeFactorsOfaNumber {

    // Method to find and print prime factors of a given number
    public static void primeFactors(int n) {
        // Loop through all potential factors from 2 up to n
        for (int i = 2; i <= n; i++) {
            // Check if `i` is prime by checking divisibility
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If `i` is prime and a factor of `n`
            if (isPrime) {
                int x = n;
                // Print `i` for each time it divides `x`
                while (x % i == 0) {
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to find its prime factors: ");
        int n = sc.nextInt();

        System.out.println("Prime factors of " + n + " are: ");
        primeFactors(n);

        sc.close();
    }
}
/*
Enter an integer to find its prime factors: 90
Prime factors of 90 are:
2 3 3 5
 */