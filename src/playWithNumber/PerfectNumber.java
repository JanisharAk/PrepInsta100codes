package playWithNumber;

import java.util.Scanner;

public class PerfectNumber {
    /*
     6 is a perfect number because its divisors are 1, 2, and 3, and their sum
    1+2+3=6
    1+2+3=6.
     */

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        // Find divisors and calculate their sum
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfectNumber(number)) {
            System.out.println("Yes, it's a perfect number");
        } else {
            System.out.println("No, it's not a perfect number");
        }
    }
}
