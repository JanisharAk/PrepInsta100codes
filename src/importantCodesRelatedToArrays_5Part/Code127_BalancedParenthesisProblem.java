package importantCodesRelatedToArrays_5Part;

import java.util.Stack;

public class Code127_BalancedParenthesisProblem {
    /*
    The Balanced Parenthesis Problem is a classic problem in computer science,
    often used to test a candidate's understanding of stacks and recursion.
    It involves determining whether a sequence of parentheses (and possibly other
    types of brackets) is "balanced."
     */

    public static boolean isBalanced(String s) {
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse the input string
        for (char ch : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty or the top doesn't match, it's unbalanced
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    // Helper method to check if a pair of brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    // Main method for testing
    public static void main(String[] args) {
        String test1 = "({[]})";
        String test2 = "([)]";
        String test3 = "{[()]}";
        String test4 = "{[(])}";
        String test5 = "((()))";

        System.out.println(test1 + " is balanced? " + isBalanced(test1)); // true
        System.out.println(test2 + " is balanced? " + isBalanced(test2)); // false
        System.out.println(test3 + " is balanced? " + isBalanced(test3)); // true
        System.out.println(test4 + " is balanced? " + isBalanced(test4)); // false
        System.out.println(test5 + " is balanced? " + isBalanced(test5)); // true
    }

}
