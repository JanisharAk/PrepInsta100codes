package workingwithNumbers;

import java.util.Scanner;

public class Code55_OctalToDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the octal number as a string
        System.out.print("Enter an octal number: ");
        String octalStr = sc.nextLine();

        // Convert octal string to decimal
        int decimal = Integer.parseInt(octalStr, 8);

        // Output the decimal result
        System.out.println("The decimal equivalent of octal " + octalStr + " is: " + decimal);
    }
}
