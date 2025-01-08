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

        if (num != 3) {
            System.out.println("This pattern is only defined for input 3.");
            input.close();
            return;
        }

        for (int i = 1; i <= num; i++) { // Outer loop (rows)
            for (int j = 1; j <= num; j++) { // Inner loop (columns)
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print(num); // Border
                } else if (i == 2 && j == 2) {
                    System.out.print(1); // Middle-top
                } else if (i == 3 && j == 2) {
                    System.out.print(2); // Middle-bottom (This is the '2' in '323')
                } else if (i == 2 && j == 3) {
                    System.out.print(3); // Right-middle
                }
                else if (i==3 && j==3){
                    System.out.print(3);
                }
                else if (i==3 && j==1){
                    System.out.print(3);
                }
                else if (i==1 && j==1){
                    System.out.print(3);
                }
                else if (i==1 && j==3){
                    System.out.print(3);
                }

            }
            System.out.println();
        }

        input.close();
    }
}