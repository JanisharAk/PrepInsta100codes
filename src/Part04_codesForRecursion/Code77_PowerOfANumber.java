package Part04_codesForRecursion;

import java.util.Scanner;

public class Code77_PowerOfANumber {
    /*
    Input:
       Base = 2, Exponent = 3
     Output:
       2^3 = 8
     */
    public static double power(int base, int exponent) {
        // Base cases
        if (exponent == 0) {
            return 1; // Anything raised to the power 0 is 1
        }
        if (exponent > 0) {
            // Positive exponent: multiply recursively
            return base * power(base, exponent - 1);
        } else {
            // Negative exponent: return reciprocal
            return 1.0 / power(base, -exponent);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int base = in.nextInt();
        System.out.print("Enter the Exponent : ");
        int exponent = in.nextInt();
        System.out.println(base + " raised to the power " + exponent + " is: " + power(base, exponent));

    }
}
