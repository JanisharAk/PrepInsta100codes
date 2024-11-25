package workingwithNumbers;

import java.util.Scanner;

public class Code70_FindThePrimeNumbersBetween1to100 {
    /*
    Find prime numbers between start and end
    */
    public static void main(String[] args) {
        System.out.println("Enter the start number: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("Enter the end number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // Prime number
    }
}
