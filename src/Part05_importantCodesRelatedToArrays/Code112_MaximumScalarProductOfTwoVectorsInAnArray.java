package Part05_importantCodesRelatedToArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Code112_MaximumScalarProductOfTwoVectorsInAnArray {
// A⋅B=A[0]×B[0]+A[1]×B[1]+⋯+A[n−1]×B[n−1]
    public static int calculateMaxScalarProduct(int[] vector1, int[] vector2) {
        // Sort both vectors in ascending order
        Arrays.sort(vector1);
        Arrays.sort(vector2);

        // Calculate the scalar product
        int scalarProduct = 0;
        for (int i = 0; i < vector1.length; i++) {
            scalarProduct += vector1[i] * vector2[i];
        }

        return scalarProduct;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the vectors: ");
        int n = in.nextInt();

        // Input first vector
        int[] vector1 = new int[n];
        System.out.println("Enter elements of the first vector:");
        for (int i = 0; i < n; i++) {
            vector1[i] = in.nextInt();
        }

        // Input second vector
        int[] vector2 = new int[n];
        System.out.println("Enter elements of the second vector:");
        for (int i = 0; i < n; i++) {
            vector2[i] = in.nextInt();
        }

        // Calculate maximum scalar product
        int maxScalarProduct = calculateMaxScalarProduct(vector1, vector2);
        System.out.println("The maximum scalar product of the two vectors is: " + maxScalarProduct);
        in.close();
    }
}
