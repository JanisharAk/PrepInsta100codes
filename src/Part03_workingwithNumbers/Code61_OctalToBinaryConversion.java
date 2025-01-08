package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code61_OctalToBinaryConversion {
    //The binary equivalent of octal 17 is: 001111
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input octal number as a string
        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();

        // Convert octal to decimal
        int decimal = Integer.parseInt(octal, 8);

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        // Output the binary result
        System.out.println("The binary equivalent of octal " + octal + " is: " + binary);
    }
}


/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input octal number as a string
        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();

        // Initialize an empty StringBuilder to hold the binary result
        StringBuilder binary = new StringBuilder();

        // Convert each octal digit to its 3-bit binary representation
        for (int i = 0; i < octal.length(); i++) {
            // Get the current octal digit
            char octalDigit = octal.charAt(i);

            // Convert the octal digit to an integer
            int decimalDigit = Character.getNumericValue(octalDigit);

            // Convert the decimal digit to a 3-bit binary string
            String binaryDigit = String.format("%3s", Integer.toBinaryString(decimalDigit)).replace(' ', '0');

            // Append the binary digit to the result
            binary.append(binaryDigit);
        }

        // Output the binary result
        System.out.println("The binary equivalent of octal " + octal + " is: " + binary);
    }
 */