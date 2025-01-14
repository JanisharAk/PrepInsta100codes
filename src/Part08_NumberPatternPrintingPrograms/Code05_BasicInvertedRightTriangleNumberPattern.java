package Part08_NumberPatternPrintingPrograms;

import java.util.Scanner;

public class Code05_BasicInvertedRightTriangleNumberPattern {
    /*
           10987
           456
           32
           1
             GIVE INPUT AS 10, THEN IT WILL PRINT THE CODE
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = input.nextInt();

        int current = start; // Initialize the current number
        int rows = 4;        // Number of rows for the pattern

        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Determine the number of elements in the current row
            int elementsInRow = rows - i;

            // Inner loop for columns
            for (int j = 0; j < elementsInRow; j++) {
                System.out.print(current);
                current--; // Decrease the current number
            }
            System.out.println(); // Move to the next row
        }

        input.close(); // Close the scanner to avoid resource leaks
    }
}
