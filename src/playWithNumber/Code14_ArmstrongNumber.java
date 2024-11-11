package playWithNumber;

import java.util.Scanner;

public class Code14_ArmstrongNumber {
    public static void main(String[] args) {
        /*
        An Armstrong number is a positive m-digit number that
        is equal to the sum of the mth powers of their digits.
        Examples:
        - 3: 3^1 = 3
        - 153: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        - 125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
        - 1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        // Calculate the number of digits
        int numberOfDigits = String.valueOf(num).length();

        // Calculate the sum of digits raised to the power of numberOfDigits
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong Number");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number");
        }

        sc.close();
    }
}
