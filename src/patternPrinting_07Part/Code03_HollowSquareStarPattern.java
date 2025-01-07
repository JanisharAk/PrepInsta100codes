package patternPrinting_07Part;

public class Code03_HollowSquareStarPattern {
    /*
     ****
     *  *
     *  *
     ****
     */
    public static void main(String[] args) {
        int row, col;
        int size = 4; // Size of the square (4x4)

        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                // Print stars on the first and last row, or on the first and last column
                if (row == 0 || row == size - 1 || col == 0 || col == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for hollow effect
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
