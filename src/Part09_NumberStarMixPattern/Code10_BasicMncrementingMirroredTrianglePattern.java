package Part09_NumberStarMixPattern;

public class Code10_BasicMncrementingMirroredTrianglePattern {
    /*
           1
           3*2
           6*5*4
           10*9*8*7
     */

    public static void main(String[] args) {
        int n = 4; // Number of rows
        int num = 1; // Start number

        for (int i = 1; i <= n; i++) { // Loop for each row
            int startNum = num + i - 1; // Calculate the starting number for the current row
            for (int j = 1; j <= i; j++) { // Loop through elements in the row
                System.out.print(startNum); // Print the number
                if (j < i) {
                    System.out.print("*"); // Print '*' after the number except the last in the row
                }
                startNum--; // Decrement the number
            }
            num += i; // Update `num` to the starting number for the next row
            System.out.println(); // Move to the next row
        }
    }
}
