package workingwithNumbers;

import java.util.Scanner;

public class Code54_BinaryToDecimalConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input binary number as a string
        System.out.print("Enter a binary number: ");
        String binaryStr = sc.nextLine();
//METHOD ONE
        // Convert binary string to decimal
     //   int decimal = Integer.parseInt(binaryStr, 2);

        // Output the decimal result
       // System.out.println("The decimal equivalent of binary " + binaryStr + " is: " + decimal);

       //METHOD TWO FOR THIS CODE WE WILL DO MANUALLY
        int decimal = 0;
        int power = 0;

        // Convert binary to decimal manually
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            int bit = binaryStr.charAt(i) - '0'; // Convert character to integer
            decimal += bit * Math.pow(2, power); // Add bit value multiplied by 2^power
            power++;
        }

        // Output the decimal result
        System.out.println("The decimal equivalent of binary " + binaryStr + " is: " + decimal);

    }
}
