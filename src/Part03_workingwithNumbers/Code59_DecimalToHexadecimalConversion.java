package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code59_DecimalToHexadecimalConversion {
    /*
    Enter a decimal number: 255
    Output:The hexadecimal equivalent of decimal 255 is: FF
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert decimal to hexadecimal
        String hex = Integer.toHexString(decimal).toUpperCase(); // Convert to uppercase for standard representation

        // Output the hexadecimal result
        System.out.println("The hexadecimal equivalent of decimal " + decimal + " is: " + hex);
    }
    /*
    Scanner sc = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert decimal to hexadecimal manually
        StringBuilder hex = new StringBuilder();
        int number = decimal;

        while (number > 0) {
            int remainder = number % 16;
            if (remainder < 10) {
                hex.append(remainder); // Append numbers 0-9
            } else {
                hex.append((char) ('A' + (remainder - 10))); // Append letters A-F
            }
            number /= 16; // Update the number
        }

        // Reverse the hexadecimal string to get the correct order
        hex.reverse();

        // Output the hexadecimal result
        System.out.println("The hexadecimal equivalent of decimal " + decimal + " is: " + hex);
    }
}
     */
}
