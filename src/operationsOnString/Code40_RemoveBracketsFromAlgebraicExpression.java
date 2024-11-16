package operationsOnString;

import java.util.Scanner;

public class Code40_RemoveBracketsFromAlgebraicExpression {
    /*
     input (a+b=c) = output a+b=c.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an algebraic expression: ");
        String input = sc.nextLine();

        // Using StringBuilder to store result without brackets
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Append only if the character is not a bracket
            if (currentChar != '(' && currentChar != ')') {
                result.append(currentChar);
            }
        }

        System.out.println("Expression without brackets: " + result);
    }
}
