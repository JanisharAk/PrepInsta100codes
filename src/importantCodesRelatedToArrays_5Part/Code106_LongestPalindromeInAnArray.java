package importantCodesRelatedToArrays_5Part;

import java.util.Scanner;

public class Code106_LongestPalindromeInAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of strings in the array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] arr = new String[n];

        // Input strings into the array
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        // Find the longest palindrome
        String longestPalindrome = findLongestPalindrome(arr);

        if (longestPalindrome != null) {
            System.out.println("Longest Palindrome: " + longestPalindrome);
        } else {
            System.out.println("No palindrome found in the array.");
        }

        scanner.close();
    }

    public static String findLongestPalindrome(String[] arr) {
        String longest = null;

        for (String str : arr) {
            if (isPalindrome(str)) {
                if (longest == null || str.length() > longest.length()) {
                    longest = str;
                }
            }
        }

        return longest;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
