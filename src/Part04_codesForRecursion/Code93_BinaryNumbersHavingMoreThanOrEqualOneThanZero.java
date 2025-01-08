package Part04_codesForRecursion;

import java.util.Scanner;

public class Code93_BinaryNumbersHavingMoreThanOrEqualOneThanZero {
    /*
    Input: N = 3
    Output:111
           110
           101
     */
    // Recursive function to generate valid N-bit binary numbers
    public static void generateBinary(int N, int ones, int zeros, String result) {
        // Base case: if the length of the result equals N, print it
        if (result.length() == N) {
            System.out.println(result);
            return;
        }

        // Recursive case: Add a '1' and recurse
        generateBinary(N, ones + 1, zeros, result + "1");

        // Add a '0' and recurse only if ones >= zeros
        if (ones > zeros) {
            generateBinary(N, ones, zeros + 1, result + "0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("All valid N-bit binary numbers:");
        generateBinary(N, 0, 0, "");
    }
}
