package Part02_operationsOnString;

import java.util.Scanner;

public class Code46_ReplaceASubStringInAString {
    /*
    Replace a substring within a string without using built-in methods.
    Enter the main string: Hello, world! Hello, everyone!
    Enter the substring to replace: world!
    Enter the replacement substring: village
    Updated String: Hello, village Hello, everyone!
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        // Input the substring to replace
        System.out.print("Enter the substring to replace: ");
        String toReplace = sc.nextLine();

        // Input the replacement substring
        System.out.print("Enter the replacement substring: ");
        String replacement = sc.nextLine();

        // Call the method to replace the substring
        String updatedString = replaceSubstring(mainString, toReplace, replacement);

        // Print the updated string
        System.out.println("Updated String: " + updatedString);
    }

    public static String replaceSubstring(String mainString, String toReplace, String replacement) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int mainLength = mainString.length();
        int toReplaceLength = toReplace.length();

        while (i < mainLength) {
            // Check if the substring to replace is found at the current position
            if (i + toReplaceLength <= mainLength
                    && mainString.substring(i, i + toReplaceLength).equals(toReplace)) {
                result.append(replacement); // Append the replacement substring
                i += toReplaceLength;       // Move the pointer past the matched substring
            } else {
                result.append(mainString.charAt(i)); // Append the current character
                i++;
            }
        }

        return result.toString();
    }
}
