package Part04_codesForRecursion;

import java.util.Scanner;

public class Code85_PermutationsOfAString {
    private static int count = 0; // To count the number of permutations

    // Recursive function to generate permutations
    public static void generatePermutations(String str, String result) {
        if (str.length() == 0) {
            System.out.print("Generated permutation: "+ result); // Print the generated permutation
            count++; // Increment the count for each permutation
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Pick the ith character and remove it from the rest of the string
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursive call with the new string and the current result
            generatePermutations(remaining, result + ch);
        }
    }

    public static int permutations(String s) {
        count = 0; // Reset count for each function call
        generatePermutations(s, ""); // Start the recursive process
        return count; // Return the total number of permutations
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

       // System.out.print("Permutations: ");
        int totalPermutations = permutations(s);
        System.out.println("Total Permutations: " + totalPermutations);
    }
}
