package Part09_NumberStarMixPattern;

public class Code09_BasicIncrementingTrianglePatternInvertedMix {
    /*
           1
           4*5*6
           2*3
           7*8*9*10
     */

    public static void main(String[] args) {
        int n = 4; // Number of rows
        int[] rowLengths = {1, 3, 2, 4}; // Define the number of elements in each row
        int num = 1; // Start number

        for (int i = 0; i < n; i++) { // Loop through each row
            for (int j = 1; j <= rowLengths[i]; j++) { // Loop through each element in the current row
                System.out.print(num); // Print the number
                if (j < rowLengths[i]) {
                    System.out.print("*"); // Print '*' after the number except the last in the row
                }
                num++; // Increment the number
            }
            System.out.println(); // Move to the next row
        }
    }
}
