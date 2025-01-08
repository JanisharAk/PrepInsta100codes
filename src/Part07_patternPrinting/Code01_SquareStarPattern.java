package Part07_patternPrinting;

public class Code01_SquareStarPattern {
    /*
     ****
     ****
     ****
     ****
     */
    public static void main(String[] args) {
        int row, col;
        for (row = 1; row <= 5; row++) {
            for (col = 1; col <= 5; col++) {
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}
