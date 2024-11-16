package operationsOnString;

import java.util.Scanner;

public class Code36_CheckIfTheGivenStringPalindromeOrNot {
    /*
    madam = yes it is palindrome
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String p = sc.nextLine();

        // Convert the string to lowercase to handle case insensitivity
        p = p.toLowerCase();

        // Palindrome check using two pointers
        int left = 0;
        int right = p.length() - 1;

        boolean isPalindrome = true;
        while (left < right) {
            if (p.charAt(left) != p.charAt(right)) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
            left++;
            right--;
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }
    }
}
