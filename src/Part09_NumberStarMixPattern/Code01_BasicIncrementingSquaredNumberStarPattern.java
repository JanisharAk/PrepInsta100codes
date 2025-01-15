package Part09_NumberStarMixPattern;

public class Code01_BasicIncrementingSquaredNumberStarPattern {
    /*
           1*2*3*4
           5*6*7*8
           9*10*11*12
           13*14*15*16

     */
    public static void main(String[] args) {
        int num = 1; // Starting number
        int rows = 4; // Number of rows
        int columns = 4; // Number of columns

        // Loop through rows
        for (int i = 0; i < rows; i++) {
            // Loop through columns
            for (int j = 0; j < columns; j++) {
                // Print the number followed by '*', except for the last number in each row
                if (j == columns - 1) {
                    System.out.print(num);
                } else {
                    System.out.print(num + "*");
                }
                num++; // Increment the number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
