package Part07_patternPrinting;

import java.util.Scanner;

public class Code05_RhombusStarPattern {
    /*
     ****
      ****
       ****
        ****
     */
    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        rows = sc.nextInt();

        // Loop to print upper half of the rhombus
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars after spaces
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        sc.close();
    }
}
