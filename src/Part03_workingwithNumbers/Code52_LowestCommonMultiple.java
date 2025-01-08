package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code52_LowestCommonMultiple {
    /*
    Input : 12, 18
    Output : 36
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Find the larger of the two numbers
        int min = (num1 > num2) ? num1 : num2;

        // Start iterating from the larger number
        while (true) {
            if (min % num1 == 0 && min % num2 == 0) {
                // If min is divisible by both numbers, it is the LCM
                System.out.println("The Lowest Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + min);
                break;
            }
            // Increment min to check the next number
            min++;
        }
    }
}
