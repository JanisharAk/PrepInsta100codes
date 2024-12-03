package codesForRecursion;

import java.util.Scanner;

public class Code84_CalculateLengthOfTheString {
    public static int calculateLength(String str) {
        // Base case: empty string
        if (str.equals("")) {
            return 0;
        }

        // Recursive case: remove the first character and calculate for the rest
        return 1 + calculateLength(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int length = calculateLength(input);
        System.out.println("The length of the string is: " + length);
    }
}
