package Part09_NumberStarMixPattern;

public class Code05_BasicIncrementingInvertedSquaredNumberStarPatternAlternate {
    /*
          1*2*3*4
          9*10*11*12
          17*18*19*20
          13*14*15*16
          5*6*7*8
     */
    public static void main(String[] args) {
        int rows = 5;
        int cols = 4;

        int start = 1;
        int increment = 8; // Difference between starting numbers of rows

        for (int i = 0; i < rows; i++) {
            int current = start;
            for (int j = 0; j < cols; j++) {
                System.out.print(current);
                if (j < cols - 1) {
                    System.out.print("*");
                }
                current++;
            }
            System.out.println();

            if (i == 0) {
                start = 9;
            } else if (i == 1) {
                start = 17;
            } else if (i == 2) {
                start = 13;
            } else if (i == 3) {
                start = 5;
            }
        }
    }
}