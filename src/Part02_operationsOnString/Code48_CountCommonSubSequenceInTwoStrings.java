package Part02_operationsOnString;

import java.util.HashSet;

public class Code48_CountCommonSubSequenceInTwoStrings {

    public static void main(String[] args) {
        // Example strings
        String str1 = "abc";
        String str2 = "ac";

        // Generate subsequences for both strings
        HashSet<String> subsequences1 = generateSubsequences(str1);
        HashSet<String> subsequences2 = generateSubsequences(str2);

        // Count common subsequences
        int commonCount = countCommonSubsequences(subsequences1, subsequences2);

        // Output the result
        System.out.println("Number of common subsequences: " + commonCount);
    }

    // Generate all subsequences of a string
    public static HashSet<String> generateSubsequences(String str) {
        HashSet<String> subsequences = new HashSet<>();
        generateSubsequencesHelper(str, 0, "", subsequences);
        return subsequences;
    }

    private static void generateSubsequencesHelper(String str, int index, String current, HashSet<String> subsequences) {
        if (index == str.length()) {
            subsequences.add(current); // Add the current subsequence
            return;
        }

        // Include the current character
        generateSubsequencesHelper(str, index + 1, current + str.charAt(index), subsequences);

        // Exclude the current character
        generateSubsequencesHelper(str, index + 1, current, subsequences);
    }

    // Count common subsequences between two sets
    public static int countCommonSubsequences(HashSet<String> set1, HashSet<String> set2) {
        int count = 0;

        // Compare all subsequences of set1 with set2
        for (String subsequence : set1) {
            if (set2.contains(subsequence)) {
                count++;
            }
        }

        return count;
    }
}
