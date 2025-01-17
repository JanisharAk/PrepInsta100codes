package Part09_NumberStarMixPattern;

public class Code06_BasicIncrementingInvertedSquaredNumberStarPatternMirroredAlternate {
    /*
          4*3*2*1
          12*11*10*9
          8*7*6*5
          16*15*14*13
     */
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        int start = 4; // Starting number for the first row

        for (int i = 1; i <= rows; i++) {
            int current = start;
            for (int j = 0; j < cols; j++) {
                System.out.print(current);
                if (j < cols - 1) {
                    System.out.print("*");
                }
                current--; // Decrement within the row
            }
            System.out.println();

            // Update start for the next row
            if (i == 1) {
                start = 12;
            } else if (i == 2) {
                start = 8;
            } else if (i == 3) {
                start = 16;
            }
        }
    }
}