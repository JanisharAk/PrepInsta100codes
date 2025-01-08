package Part07_patternPrinting;

import java.util.Scanner;

public class Code09_PyramidStarPattern {
    /*

        *
       ***
      *****
     *******
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pyramid: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the pyramid: ");
       // int columns = sc.nextInt();
        
        for(int i = 1; i <= rows; i++){
            // Print spaces before stars (leading spaces)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
