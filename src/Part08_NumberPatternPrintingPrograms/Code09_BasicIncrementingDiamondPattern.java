package Part08_NumberPatternPrintingPrograms;

import java.util.Scanner;

public class Code09_BasicIncrementingDiamondPattern {
    /*
           3  (Initialize starting number)
           44
           555
           6666
           555
           44
           3

           Enter row is 4 and initialize with 3, then the ouput will come
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int initialize = 3; // Initialize the starting number

        // Upper half of the diamond (including the middle row)
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(initialize); // Print the current number
            }
            System.out.println(); // Move to the next row
            initialize++; // Increment the number for the next row
        }

        // Lower half of the diamond (excluding the middle row)
        initialize-=2; // Adjust the value to start the decreasing part
        for (int i = rows - 1; i >= 1; i--) { // Start from rows-1 to avoid the middle row
            // Inner loop for printing the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(initialize); // Print the current number
            }
            System.out.println(); // Move to the next row
            initialize--; // Decrement the number for the next row
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}