package patternPrinting_07Part;

import java.util.Scanner;

public class Code08_TriangleStarPattern {
    /*

     *
     **
     ***
     ****

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++){
            // print the star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
