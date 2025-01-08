package Part04_codesForRecursion;

import java.util.Scanner;

public class Code88_LastNonZeroDigitInFactorial {
    // Recursive function to compute the factorial modulo 10, ignoring factors of 2 and 5
    public static int factorialMod10(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        }

        // Recursive call for n / 5 (ignoring multiples of 5)
        int smallFactorial = factorialMod10(n / 5);

        // Compute the product of the remaining numbers modulo 10
        int product = 1;
        for (int i = 1; i <= n % 5; i++) {
            product = (product * i) % 10;
        }

        // Adjust for skipped factors of 2 (when n/5 is odd, we multiply by 4)
        if ((n / 5) % 2 == 1) {
            product = (product * 4) % 10;
        }

        return (smallFactorial * product) % 10;
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the last non-zero digit of its factorial: ");
        int n = sc.nextInt();

        // Compute the last non-zero digit using the recursive function
        int result = factorialMod10(n);

        // Display the result
        System.out.println("The last non-zero digit of " + n + "! is: " + result);

    }
}
