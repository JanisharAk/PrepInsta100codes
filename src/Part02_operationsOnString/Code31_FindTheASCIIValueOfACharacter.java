package Part02_operationsOnString;

import java.util.Scanner;

public class Code31_FindTheASCIIValueOfACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Find ASCII value by manually counting
        int asciiValue = 0;
        for (int i = 0; i <= 127; i++) { // ASCII values range from 0 to 127 for standard ASCII
            if (ch == (char) i) { //ch == (char) i is used to compare the character ch with each
                // possible ASCII character by casting i (an integer) to a char.
                asciiValue = i;
                break;
            }
        }
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
