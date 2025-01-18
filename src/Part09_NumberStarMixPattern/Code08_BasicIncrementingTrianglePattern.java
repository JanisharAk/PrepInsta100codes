package Part09_NumberStarMixPattern;

public class Code08_BasicIncrementingTrianglePattern {
    /*
           7*8*9*10
           4*5*6
           2*3
           1
     */

    public static void main(String[] args) {
        int n = 4; // Number of rows
        int num = (n * (n + 1)) / 2; // Start number for the first row (total elements in the triangle)

        for (int i = n; i >= 1; i--) { // Loop for each row, starting from the bottom row
            int startNum = num - i + 1; // Calculate the starting number for the row
            for (int j = 1; j <= i; j++) { // Loop for each element in the row
                System.out.print(startNum); // Print the number
                if (j < i) {
                    System.out.print("*"); // Print '*' after the number except the last in the row
                }
                startNum++; // Increment the number
            }
            num -= i; // Update the starting number for the next row
            System.out.println(); // Move to the next row
        }
    }
}
