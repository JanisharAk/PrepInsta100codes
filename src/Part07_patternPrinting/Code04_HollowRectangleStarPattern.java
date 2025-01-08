package Part07_patternPrinting;

public class Code04_HollowRectangleStarPattern {
    /*
     ******
     *    *
     *    *
     ******
     */
    public static void main(String[] args) {
        int row, col;
        int width = 6; // Number of columns (for a 6-column rectangle)
        int height = 4; // Number of rows (for a 4-row rectangle)

        // Outer loop for rows
        for (row = 0; row < height; row++) {
            // Inner loop for columns
            for (col = 0; col < width; col++) {
                // Print stars on the first and last row, or on the first and last column
                if (row == 0 || row == height - 1 || col == 0 || col == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for hollow effect
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
