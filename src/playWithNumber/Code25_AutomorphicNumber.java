package playWithNumber;

import java.util.Scanner;

public class Code25_AutomorphicNumber {
    /*
    An automorphic number (or circular number) is a number
    whose square ends with the same digits as the number itself.
    For example, 5 and 25 are automorphic numbers because:
    5^2 = 25 (ends in 5)
    25^2 = 625 (ends in 25)
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculate the square of the number
        int square = num * num;

        // Use modulo to get the last digits of the square that match the number of digits in num
        int temp = num;
        boolean isAutomorphic = true;

        // Check if the last digits of square match the number itself
        while (temp > 0) {
            if (square % 10 != temp % 10) {
                isAutomorphic = false;
                break;
            }
            square /= 10;
            temp /= 10;
        }

        if (isAutomorphic) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }

        sc.close();
    }
}
