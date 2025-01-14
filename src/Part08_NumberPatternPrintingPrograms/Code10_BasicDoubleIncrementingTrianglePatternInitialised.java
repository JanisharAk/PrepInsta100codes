package Part08_NumberPatternPrintingPrograms;

import java.util.Scanner;

public class Code10_BasicDoubleIncrementingTrianglePatternInitialised {
    /*
            3
            45
            678
            9101112
            678
            45
            3

            Enter rows is 4 and initialize with 3, then the output will come
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