package importantCodesRelatedToArrays_5Part;

import java.util.Arrays;
import java.util.Scanner;

public class Code111_FindingMinimumScalarProductOfTwoVectors {

    // Recursive function to calculate the scalar product
    public static int productOfTwoVector(int[] vector1, int[] vector2, int index) {
        // Base case: If we have processed all elements, return 0
        if (index == vector1.length) {
            return 0;
        }

        // Calculate scalar product for the current index and recurse for the rest
        return vector1[index] * vector2[index] + productOfTwoVector(vector1, vector2, index + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the vectors: ");
        int n = in.nextInt();

        int[] firstVector = new int[n];
        int[] secondVector = new int[n];

        System.out.println("Enter elements of the first vector:");
        for (int i = 0; i < n; i++) {
            firstVector[i] = in.nextInt();
        }

        System.out.println("Enter elements of the second vector:");
        for (int i = 0; i < n; i++) {
            secondVector[i] = in.nextInt();
        }

        // Sort first vector in ascending order
        Arrays.sort(firstVector);
        // Sort second vector in descending order
        Arrays.sort(secondVector);
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = secondVector[i];
            secondVector[i] = secondVector[j];
            secondVector[j] = temp;
        }

        // Calculate minimum scalar product using recursion
        int result = productOfTwoVector(firstVector, secondVector, 0);

        System.out.println("The minimum scalar product of the two vectors is: " + result);
        in.close();
    }
}
