package NumberPatternPrintingPrograms_08Part;

import java.util.Scanner;

public class Code01_BasicSquare1Pattern {
    /*
           1111
           1111
           1111
           1111
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
