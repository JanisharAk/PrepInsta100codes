package Part09_NumberStarMixPattern;

public class Code07_BasicIncrementingTrianglePattern {
    /*
           1
           2*3
           4*5*6
           7*8*9*10
     */

    public static void main(String[] args) {
        int n = 4; // Number of rows
        int num = 1; // Start number

        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop for each element in the row
                System.out.print(num); // Print the number
                if (j < i) {
                    System.out.print("*"); // Print '*' after the number except the last in the row
                }
                num++; // Increment the number
            }
            System.out.println(); // Move to the next row
        }
    }
}
