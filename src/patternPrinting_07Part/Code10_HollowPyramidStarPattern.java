package patternPrinting_07Part;

import java.util.Scanner;

public class Code10_HollowPyramidStarPattern {
    /*
        *
       * *
      *   *
     *******
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == 2 * i - 1 || i == rows) {
                    // Print star at the first or last position or if it's the last row
                    System.out.print("*");
                } else {
                    // Print space for hollow pyramid
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
