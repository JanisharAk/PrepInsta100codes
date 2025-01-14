package Part08_NumberPatternPrintingPrograms;

import java.util.Scanner;

public class Code04_BasicRightTriangleNumberPattern {
    /*
           1
           23
           456
           78910
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for the number of rows to print
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        // Variable to track the current number to print
        int num = 1;

        // Loop to print each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num); // Print the current number
                num++; // Increment the number
            }
            System.out.println(); // Move to the next line after each row
        }

        input.close();
    }
}
