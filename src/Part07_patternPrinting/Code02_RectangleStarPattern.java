package Part07_patternPrinting;

public class Code02_RectangleStarPattern {
    /*
     ******
     ******
     ******
     ******
     */
    public static void main(String[] args) {
        int row,col;
        for (row = 1; row <= 6; row++) {
            for (col = 1; col <= 4; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
