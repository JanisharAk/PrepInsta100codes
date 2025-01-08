package Part04_codesForRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code89_ReturnTheNthRowOfPascalTriangle {

    /*
    Input: Enter the row number to fetch from Pascal's Triangle: 5
    Output:The 5th row of Pascal's Triangle is: [1, 4, 6, 4, 1]
     */
    // Recursive function to compute binomial coefficient C(n, k)
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base cases: C(n, 0) = 1 and C(n, n) = 1
        }
        // Recursive formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    // Function to return the nth row of Pascal's Triangle
    public static List<Integer> pascalTriangle(int row) {
        List<Integer> result = new ArrayList<>();
        for (int col = 0; col < row; col++) {
            result.add(binomialCoefficient(row - 1, col)); // Compute each element in the row
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number to fetch from Pascal's Triangle: ");
        int row = sc.nextInt();

        // Compute the nth row of Pascal's Triangle
        List<Integer> result = pascalTriangle(row);

        // Print the result
        System.out.print("The " + row + "th row of Pascal's Triangle is: ");
        System.out.println(result);
    }

}
