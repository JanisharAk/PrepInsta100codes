package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code58_DecimalToOctalConversion {
    /*
    Enter a decimal number: 100
    Output: The octal equivalent of decimal 100 is: 144
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert decimal to octal
        String octal = Integer.toOctalString(decimal);

        // Output the octal result
        System.out.println("The octal equivalent of decimal " + decimal + " is: " + octal);




        /*
        Scanner sc = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert decimal to octal manually
        StringBuilder octal = new StringBuilder();
        int number = decimal;

        while (number > 0) {
            int remainder = number % 8;
            octal.append(remainder); // Append remainder (octal digit)
            number /= 8; // Update the number
        }

        // Reverse the octal string to get the correct order
        octal.reverse();

        // Output the octal result
        System.out.println("The octal equivalent of decimal " + decimal + " is: " + octal);
    }
         */
    }
}
