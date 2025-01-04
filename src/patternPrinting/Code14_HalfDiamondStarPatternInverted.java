package patternPrinting;

import java.util.Scanner;

public class Code14_HalfDiamondStarPatternInverted {
    /*

        *
       **
      ***
     ****
      ***
       **
        *

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the upper half of the diamond: ");
        int rows = sc.nextInt();

        // Upper part of the diamond (Pyramid shape)
        for (int i = 1; i <= rows; i++) {
            // Print spaces to align stars in the center
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond (Inverted Pyramid shape)
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces to align stars in the center
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
