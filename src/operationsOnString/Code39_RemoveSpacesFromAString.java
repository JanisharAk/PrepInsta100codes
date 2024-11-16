package operationsOnString;

import java.util.Scanner;

public class Code39_RemoveSpacesFromAString {
    // "asd vh" = "asdvh"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Using StringBuilder to remove spaces
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') { // Check if the character is not a space
                result.append(input.charAt(i));
            }
        }

        System.out.println("String without spaces: " + result);
    }
}
