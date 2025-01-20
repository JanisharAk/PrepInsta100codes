package Part09_NumberStarMixPattern;

public class Code11_BasicIncrementingInvertedMirroredTrianglePattern {
    /*
           10*9*8*7
           6*5*4
           3*2
           1
     */
    public static void main(String[] args) {
        int num = 10;

        for (int i = 4; i >= 1; i--) { // Outer loop for rows (4 rows)
            for (int j = 1; j <= i; j++) { // Inner loop for numbers in each row
                System.out.print(num);
                if (j < i) { // Print "*" except for the last number in the row
                    System.out.print("*");
                }
                num--;
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}