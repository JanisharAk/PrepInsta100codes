package patternPrinting_07Part;

import java.util.Scanner;

public class Code06_ParallelogramStarPattern {
    /*
     ******
      ******
       ******
        ******
     */
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the size of the column: ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            // Print leading spaces for each row
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars in each row
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }
}
