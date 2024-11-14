package operationsOnString;

import java.util.Scanner;

public class Code32_LengthOfTheStringWithoutStrlenfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        // Calculate length manually without using built-in length() method
        int length = 0;
        for (int i = 0; i < s.length(); i++) {  // Use s.length() to determine loop limit
            length++;
        }

        System.out.println("Length of the String: " + length);
    }
}
