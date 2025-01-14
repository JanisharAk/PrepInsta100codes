package Part08_NumberPatternPrintingPrograms;

public class Code11_BasicIncrementingTrianglePatternInvertedInitialisedMirrored {
    /*
           3
           54
           876
           1211109
           876
           54
           3
     */
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the upper triangle
        int num = 3;

        // Upper Triangle
        for (int i = 1; i <= rows; i++) {
            int temp = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp--;
            }
            num += i + 1;
            System.out.println();
        }

        // Lower Triangle (Inverted)
        num -= (rows + (rows + 1)); // Adjust num for the lower triangle
        for (int i = rows - 1; i >= 1; i--) {
            int temp = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp--;
            }
            num -= i;
            System.out.println();
        }
    }
}