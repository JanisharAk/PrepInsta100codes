package playWithNumber;

import java.util.Scanner;

public class Code13_PalindromeNumber {
    /*
    Examples: 123321, 12321, and 121 are palindrome numbers.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int OriginalNum = sc.nextInt();
        int temp = OriginalNum; // Store the original number to use for comparison
        int reversedNum = 0;

        // Reverse the number
        while (temp > 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
        }

        // Compare the original number with the reversed number
        if (OriginalNum == reversedNum) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
        sc.close();
    }
}
