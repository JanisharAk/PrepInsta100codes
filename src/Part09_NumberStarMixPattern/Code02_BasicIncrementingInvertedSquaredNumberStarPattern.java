package Part09_NumberStarMixPattern;

public class Code02_BasicIncrementingInvertedSquaredNumberStarPattern {
    /*
           13*14*15*16
           9*10*11*12
           5*6*7*8
           1*2*3*4
     */
    public static void main(String[] args) {
        int rows = 4;
        int num = 1;

        // Calculate starting number for the top row
        num = rows * (rows -1) +1;

        for (int i = rows; i >= 1; i--) {
            int current = num;
            for (int j = 1; j <= rows; j++) {
                System.out.print(current);
                if (j < rows) { // Print '*' except for the last number in the row
                    System.out.print("*");
                }
                current++;
            }
            num -= rows; // Decrement num by rows for the next row
            System.out.println();
        }
    }
}