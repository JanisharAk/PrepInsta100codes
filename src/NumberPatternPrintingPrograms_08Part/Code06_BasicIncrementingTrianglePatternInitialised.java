package NumberPatternPrintingPrograms_08Part;

import java.util.Scanner;

public class Code06_BasicIncrementingTrianglePatternInitialised {
    /*
           6666
           555
           44
           3
           GIVE INPUT AS 3, THEN IT WILL PRINT THE CODE
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        int initial = input.nextInt();

        int current = initial + 3; // Start from the value 3 levels above the initial

        // Outer loop for rows
        for (int i = 0; i < 4; i++) { // Fixed 4 rows for the pattern
            // Inner loop for columns
            for (int j = 0; j < 4 - i; j++) { // Columns decrease in each row
                System.out.print(current);
            }
            System.out.println(); // Move to the next line
            current--; // Decrement the number for the next row
        }

        input.close(); // Close the scanner to avoid resource leaks
    }
}