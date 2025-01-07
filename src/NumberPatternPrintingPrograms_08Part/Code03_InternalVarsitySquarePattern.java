package NumberPatternPrintingPrograms_08Part;

import java.util.Scanner;

public class Code03_InternalVarsitySquarePattern {
    /*
           333
           313
           323
           333
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= num; i++) {
            // Inner loop for columns
            for (int j = 1; j <= num; j++) {
                // Boundary case: Print 'num' if it's on the boundary
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print(num);
                } else {
                    // For the inner part of the square, print 'num - 1'
                    System.out.print(num - 1);
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        input.close(); // Close scanner to avoid resource leak
    }
}
