package Part08_NumberPatternPrintingPrograms;

import java.util.Scanner;

public class Code02_BasicSquareIncrementingPattern {
    /*
           1111
           2222
           3333
           4444
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print(rows);// Print the current row number
            }
            System.out.println();// Move to the next line after each row
        }
    }
}
