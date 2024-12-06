package codesForRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code90_BalancedParentheses {
    /*
    Input: Enter the number of pairs of parentheses: 3
    Output: All combinations of well-formed parentheses:
            ((()))
            (()())
            (())()
            ()(())
            ()()()
     */

    // Recursive function to generate all combinations
    public static void generateParentheses(int open, int close, String current, List<String> result) {
        // Base case: If the current string is of length 2N, add it to the result
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }

        // If we can add an open parenthesis, do so
        if (open > 0) {
            generateParentheses(open - 1, close, current + "(", result);
        }

        // If we can add a close parenthesis, do so
        if (close > open) {
            generateParentheses(open, close - 1, current + ")", result);
        }
    }

    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        generateParentheses(n, n, "", result); // Start with `n` open and `n` close
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs of parentheses: ");
        int n = sc.nextInt();

        // Generate all combinations of balanced parentheses
        List<String> combinations = generateParentheses(n);

        // Print the results
        System.out.println("All combinations of well-formed parentheses:");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}

