package importantCodesRelatedToArrays_5Part;

import java.util.HashMap;
import java.util.Scanner;

public class Code114_FindAllSymmetricPairsInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of pairs: ");
        int n = sc.nextInt();

        int[][] pairs = new int[n][2];
        System.out.println("Enter the pairs (two numbers per pair): ");
        for (int i = 0; i < n; i++) {
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }

        // HashMap to store pairs
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Symmetric pairs are:");
        for (int i = 0; i < n; i++) {
            int a = pairs[i][0];
            int b = pairs[i][1];

            // Check if the reverse pair exists in the map
            if (map.containsKey(b) && map.get(b) == a) {
                System.out.println("(" + b + ", " + a + ")");
            } else {
                // Add the pair (a, b) to the map
                map.put(a, b);
            }
        }
    }
}

/*
HashMap Usage:
The key represents the first element of the pair.
The value represents the second element of the pair.

Symmetry Check:
For every pair (a, b), check if the reverse pair (b, a) exists as b in the
key and a as its value.
 */