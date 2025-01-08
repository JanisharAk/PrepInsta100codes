package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code62_QuadrantsInWhichAGivenCoordinateLies {
    /*
    Input:
      Enter x-coordinate: 3
      Enter y-coordinate: 4
    Output 1:
      The point (3, 4) lies in the First Quadrant.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the coordinates
        System.out.print("Enter x-coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y-coordinate: ");
        int y = sc.nextInt();

        // Determine the quadrant or axis
        if (x > 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the First Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the Second Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the Third Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the Fourth Quadrant.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies at the Origin.");
        } else if (x == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the Y-axis.");
        } else if (y == 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the X-axis.");
        }
    }
}
