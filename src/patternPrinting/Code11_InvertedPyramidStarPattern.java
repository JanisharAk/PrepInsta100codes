package patternPrinting;

import java.util.Scanner;

public class Code11_InvertedPyramidStarPattern {
    /*

     *******
      *****
       ***
        *

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the pyramid: ");
        int rows = sc.nextInt();

        // Loop through each row
        for(int i = 1; i <= rows; i++) {
            // Print leading spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for(int k = 1; k <= 2 * (rows - i) + 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
        sc.close(); // Close the scanner
    }
}