package Part08_NumberPatternPrintingPrograms;

import java.util.Scanner;

public class Code13_BasicDoubleIncrementingTrianglePatternInitialisedSandwich {
    /*
            2
            34
            567
            891011
            891011
            567
            34
            2
              row = 4, initialize =2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows number: ");
        int rows = sc.nextInt();
        System.out.print("Enter the initial number: ");
        int initialize = sc.nextInt();

        // Upper half
        int num = initialize;
        for (int i = 1; i <= rows; i++) {
            int current = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(current);
                current++;
            }
            num += i;
            System.out.println();
        }

        // Lower half (Finally Corrected)
        num = initialize + rows -1; // Correct initialization for lower half
        for (int i = rows - 1; i >= 1; i--) {
            int current = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(current);
                current++;
            }
            num -= (i - 1);
            System.out.println();
        }

        sc.close();

    }


}
