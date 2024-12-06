package codesForRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code92_FindAllPossiblePalindromicPartitionsOfTheGivenString {
    /*
    Palindromic partitioning of a string involves dividing the string into
    substrings such that every substring in the partition is a palindrome.

    Input: Enter the string: aab
    Output: All possible palindromic partitions:
           [a, a, b]
           [aa, b]
     */

    public static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive function to find all palindromic partitions
    public static void findPartitions(String str, int start, List<String> currentPartition, List<List<String>> result) {
        // Base case: If we reach the end of the string
        if (start == str.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        // Try all possible substrings starting from `start`
        for (int end = start; end < str.length(); end++) {
            // Check if the substring str[start:end+1] is a palindrome
            if (isPalindrome(str, start, end)) {
                // Add this substring to the current partition
                currentPartition.add(str.substring(start, end + 1));

                // Recur for the remaining substring
                findPartitions(str, end + 1, currentPartition, result);

                // Backtrack: Remove the last added substring
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    // Wrapper function to initiate recursive palindromic partitioning
    public static List<List<String>> palindromicPartitions(String str) {
        List<List<String>> result = new ArrayList<>();
        findPartitions(str, 0, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        List<List<String>> partitions = palindromicPartitions(s);

        System.out.println("The palindromic partitions are:");
        for (List<String> partition : partitions) {
            System.out.println(partition);
        }
    }
}