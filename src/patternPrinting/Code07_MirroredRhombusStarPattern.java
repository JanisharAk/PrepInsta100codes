package patternPrinting;

import java.util.Scanner;

public class Code07_MirroredRhombusStarPattern {
    /*
        ****
       ****
      ****
     ****
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++){
            // Print spaces before the stars
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars after spaces
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
