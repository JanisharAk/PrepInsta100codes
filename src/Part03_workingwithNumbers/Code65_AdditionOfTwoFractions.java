package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code65_AdditionOfTwoFractions {
    /*
    1/2 + 2/3 = 7/6
     */
    // Helper method to calculate the greatest common divisor (GCD) using Euclid's algorithm
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Helper method to calculate the least common denominator (LCD)
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static String addFractions(int num1, int den1, int num2, int den2) {
        // Find the least common denominator (LCD)
        int lcd = lcm(den1, den2);

        // Adjust the numerators to the common denominator
        int numerator1 = num1 * (lcd / den1);
        int numerator2 = num2 * (lcd / den2);

        // Add the numerators
        int resultNumerator = numerator1 + numerator2;

        // Simplify the result
        int gcdResult = gcd(resultNumerator, lcd);
        int simplifiedNumerator = resultNumerator / gcdResult;
        int simplifiedDenominator = lcd / gcdResult;

        return simplifiedNumerator + "/" + simplifiedDenominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator and denominator of the first fraction:");
        int num1 = scanner.nextInt();
        int den1 = scanner.nextInt();

        System.out.println("Enter the numerator and denominator of the second fraction:");
        int num2 = scanner.nextInt();
        int den2 = scanner.nextInt();

        // Check for denominator = 0
        if (den1 == 0 || den2 == 0) {
            System.out.println("Denominator cannot be zero.");
            return;
        }

        String result = addFractions(num1, den1, num2, den2);
        System.out.println("Result: " + result);
    }
}
