package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code60_BinaryToOctalConversion {
    /*
    Group the binary number into sets of 3 digits from the right: 101 110.
    Convert each group: 101 in binary is 5 in octal.
    110 in binary is 6 in octal.
    So, the octal equivalent of 101110 is 56.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input binary number as a string
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);

        // Convert decimal to octal
        String octal = Integer.toOctalString(decimal);

        // Output the octal result
        System.out.println("The octal equivalent of binary " + binary + " is: " + octal);
    }
}
/*
Scanner sc = new Scanner(System.in);

        // Input binary number as a string
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        // Pad the binary number to make its length a multiple of 3
        int length = binary.length();
        int remainder = length % 3;
        if (remainder != 0) {
            int padLength = 3 - remainder;
            binary = "0".repeat(padLength) + binary; // Prepend 0s to make the length a multiple of 3
        }

        // Convert binary to octal by grouping in sets of 3
        StringBuilder octal = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 3) {
            String group = binary.substring(i, i + 3);
            int octalDigit = Integer.parseInt(group, 2);
            octal.append(octalDigit);
        }

        // Output the octal result
        System.out.println("The octal equivalent of binary " + binary + " is: " + octal);
    }
 */
