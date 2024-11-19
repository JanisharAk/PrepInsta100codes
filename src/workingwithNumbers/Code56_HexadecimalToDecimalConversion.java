package workingwithNumbers;

import java.util.Scanner;

public class Code56_HexadecimalToDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input hexadecimal number as a string
        //USING INTEGER.PARSEINT()

//        System.out.print("Enter a hexadecimal number: ");
//        String hexStr = sc.nextLine();
//        // Convert hexadecimal string to decimal
//        int decimal = Integer.parseInt(hexStr, 16);
//        // Output the decimal result
//        System.out.println("The decimal equivalent of hexadecimal " + hexStr + " is: " + decimal);
//

        //MANUAL CONVERSION

        // Input hexadecimal number as a string
        System.out.print("Enter a hexadecimal number: ");
        String hexStr = sc.nextLine();

        int decimal = 0;
        int power = 0;

        // Convert hexadecimal to decimal manually
        for (int i = hexStr.length() - 1; i >= 0; i--) {
            char hexChar = hexStr.charAt(i);

            // Convert hex character to integer value
            int digitValue;
            if (Character.isDigit(hexChar)) {
                digitValue = hexChar - '0'; // For 0-9
            } else {
                digitValue = Character.toUpperCase(hexChar) - 'A' + 10; // For A-F
            }

            decimal += digitValue * Math.pow(16, power); // Add digit * 16^power
            power++;
        }

        // Output the decimal result
        System.out.println("The decimal equivalent of hexadecimal " + hexStr + " is: " + decimal);


    }
}
