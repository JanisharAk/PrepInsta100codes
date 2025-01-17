package Part09_NumberStarMixPattern;

public class Code04_BasicIncrementingInvertedSquaredNumber {
    /*
          1*2*3*4
          9*10*11*12
          13*14*15*16
          5*6*7*8
     */
    public static void main(String[] args) {
        int rows = 4;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            if (i == 1) {
                num = 1;
            } else if (i == 2) {
                num = 9;
            } else if (i == 3) {
                num = 13;
            } else if (i == 4) {
                num = 5;
            }

            for (int j = 0; j < rows; j++) {
                System.out.print(num + j);
                if (j < rows - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}