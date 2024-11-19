package workingwithNumbers;

import java.util.Scanner;

public class Code57_DecimalToBinaryConversion {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Using Integer.toBinaryString()
//        // Input a decimal number
//        System.out.print("Enter a decimal number: ");
//        int decimal = sc.nextInt();
//
//        // Convert decimal to binary
//        String binary = Integer.toBinaryString(decimal);
//
//        // Output the binary result
//        System.out.println("The binary equivalent of decimal " + decimal + " is: " + binary);
//


        //Using maunal
        Scanner sc = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert decimal to binary manually
        StringBuilder binary = new StringBuilder();
        int number = decimal;

        while (number > 0) {
            int remainder = number % 2;
            binary.append(remainder); // Append remainder (binary digit)
            number /= 2; // Update the number to be half
        }

        // Reverse the binary string to get the correct order
        binary.reverse();

        // Output the binary result
        System.out.println("The binary equivalent of decimal " + decimal + " is: " + binary);

    }
}
