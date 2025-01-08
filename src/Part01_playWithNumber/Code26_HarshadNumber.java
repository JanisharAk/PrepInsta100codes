package Part01_playWithNumber;

import java.util.Scanner;

public class Code26_HarshadNumber {
    /*
    A Harshad number (or Niven number) is an integer that is divisible
    by the sum of its digits. For example, 18 is a Harshad number because
    the sum of its digits is 1 + 8 = 9 and 18 is divisible by 9.
     */

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int sumOfDigits = 0;
        int temp = n; // Temporary variable to keep the original value of n

        // Calculate the sum of the digits
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (n % sumOfDigits == 0) {
            System.out.println(n + " is a Harshad number.");
        } else {
            System.out.println(n + " is not a Harshad number.");
        }
        sc.close();
    }
}
