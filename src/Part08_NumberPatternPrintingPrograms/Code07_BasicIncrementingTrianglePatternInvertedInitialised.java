package Part08_NumberPatternPrintingPrograms;

import java.util.Scanner;

public class Code07_BasicIncrementingTrianglePatternInvertedInitialised {
    /*
           3
           44
           555
           6666
           Input should be 4, then it will print the code
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int initialize = 3; // Initialize the starting number

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns, print the number "i" times
            for (int j = 1; j <= i; j++) {
                System.out.print(initialize); // Print the current number
            }
            System.out.println(); // Move to the next row
            initialize++; // Increment the number for the next row
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
