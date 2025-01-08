package Part07_patternPrinting;

import java.util.Scanner;

public class Code13_HalfDiamondStarPattern {
    /*

     *
     **
     ***
     ****
     ***
     **
     *

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = rows-1; i >0; i--) {
            for (int j = 1; j <=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
