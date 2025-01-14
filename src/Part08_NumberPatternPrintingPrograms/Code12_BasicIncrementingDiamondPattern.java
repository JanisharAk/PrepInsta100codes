package Part08_NumberPatternPrintingPrograms;

public class Code12_BasicIncrementingDiamondPattern {
    /*
           2
           33
           444
           5555
           5555
           444
           33
           2
             Initialize with 2
     */
    public static void main(String[] args) {
        int rows = 4;
        int initialize = 2;

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(initialize); // Space after each number
            }
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(""); // Two spaces for better formatting
            }
            initialize++;
            System.out.println();
        }

        // Lower half of the diamond
        initialize -= 2; // Adjust initialize back for the lower half
        for (int i = rows - 1; i >= 1; i--) {

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(initialize + ""); // Space after each number
            }
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(""); // Two spaces for better formatting
            }
            initialize--;
            System.out.println();
        }
    }
}