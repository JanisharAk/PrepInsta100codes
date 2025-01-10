package NumberPatternPrintingPrograms_08Part;

import java.util.Scanner;

public class Code08_BasicDoubleIncrementingTrianglePatternInitialised {
    /*
           3
           4 5
           6 7 8
           9 10 11 12

           row is 4 and initializing it with 3, then ouput will come
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number rows: ");
        int rows = sc.nextInt();

        int initialize = 3;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(initialize+" ");
                initialize++; // Increment the number after printing
            }
            System.out.println();
        }
        sc.close();
    }
}
