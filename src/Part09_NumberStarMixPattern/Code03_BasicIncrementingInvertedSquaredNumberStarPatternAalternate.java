package Part09_NumberStarMixPattern;

public class Code03_BasicIncrementingInvertedSquaredNumberStarPatternAalternate {
    /*
          1*2*3*4
          9*10*11*12
          5*6*7*8
          13*14*15*16
     */
    public static void main(String[] args) {
        int rows = 4;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            int current = num;
            for (int j = 1; j <= rows; j++) {
                System.out.print(current);
                if (j < rows) {
                    System.out.print("*");
                }
                current++;
            }
            if(i%2==0){
                num = num - (rows*(i-1)) +1;
            }
            else{
                num = num + (rows*(i));
            }

            System.out.println();
        }
    }
}