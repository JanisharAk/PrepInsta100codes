package operationsOnString;

public class Code49_CheckIfTwoStringsMatchWhereOneStringContainsWildcardCharacters {

    public static void main(String[] args) {
        /*
        Input: s1 = "a*c", s2 = "abc"
        Output: Do the strings match? true
         */
        // Example strings
        String s1 = "a*c";
        String s2 = "abc";

        // Check if the strings match
        boolean result = matchStringsWithWildcard(s1, s2, 0, 0);

        // Output the result
        System.out.println("Do the strings match? " + result);
    }

    // Recursive function to check if strings match considering wildcards
    public static boolean matchStringsWithWildcard(String s1, String s2, int i, int j) {
        // Base case: If both strings are completely matched
        if (i == s1.length() && j == s2.length()) {
            return true;
        }

        // If s1 is exhausted but s2 is not, or vice versa, they don't match
        if (i == s1.length() || j == s2.length()) {
            return false;
        }

        // Case 1: If current characters match
        if (s1.charAt(i) == s2.charAt(j)) {
            return matchStringsWithWildcard(s1, s2, i + 1, j + 1);
        }

        // Case 2: If current character in s1 is a wildcard '*'
        if (s1.charAt(i) == '*') {
            // Skip the '*' in s1 and continue, or skip the character in s2 and continue
            return matchStringsWithWildcard(s1, s2, i + 1, j) || matchStringsWithWildcard(s1, s2, i, j + 1);
        }

        // If characters don't match and there's no wildcard, return false
        return false;
    }
}
