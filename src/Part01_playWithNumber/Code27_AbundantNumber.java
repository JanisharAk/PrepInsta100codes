package Part01_playWithNumber;

import java.util.Scanner;

public class Code27_AbundantNumber {
    /*
    An abundant number (or excessive number) is a positive integer
    that is smaller than the sum of its proper divisors, excluding itself.
    Example: For 12, the sum of its divisors is 1 + 2 + 3 + 4 + 6 = 16.
    Since 16 > 12, 12 is an abundant number.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Calculate the sum of proper divisors
        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Check if the number is abundant
        if (sumOfDivisors > num) {
            System.out.println(num + " is an abundant number.");
        } else {
            System.out.println(num + " is not an abundant number.");
        }

        sc.close();
    }
}
