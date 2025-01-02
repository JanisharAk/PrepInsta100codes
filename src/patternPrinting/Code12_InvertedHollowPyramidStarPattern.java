package patternPrinting;

import java.util.Scanner;

public class Code12_InvertedHollowPyramidStarPattern {
    /*
     *******
      *   *
       * *
        *

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the pyramid: ");
        int rows = sc.nextInt();

        // Loop through each row
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces for hollow pyramid
            if (i == 1) {
                // First row: print all stars
                for (int k = 1; k <= 2 * (rows - i) + 1; k++) {
                    System.out.print("*");
                }
            } else if (i == rows) {
                // Last row: print only one star
                System.out.print("*");
            } else {
                // Middle rows: print star, spaces, star
                System.out.print("*");
                for (int j = 1; j <= 2 * (rows - i) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
