package codesForRecursion;

import java.util.Scanner;

public class Code82_HCFOfTwoNumbers {
    // Recursive function to find HCF
    public static int findHCF(int a, int b) {
        // Base case: if b becomes 0, HCF is a
        if (b == 0) {
            return a;
        }
        // Recursive step: call findHCF with b and remainder of a divided by b
        return findHCF(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Find and display the HCF
        int hcf = findHCF(num1, num2);
        System.out.print("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
