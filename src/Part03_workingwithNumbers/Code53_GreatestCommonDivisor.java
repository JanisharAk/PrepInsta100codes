package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code53_GreatestCommonDivisor {
    // Highest common factor and greatest common factor are same
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        //initialize the greatest common factor
        int greatestCommonDivisor = 1;

        // Find the smaller of the two numbers
        int min = (num1 < num2) ? num1 : num2;

        //loop to find the
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {  // Check if i divides both num1 and num2
                greatestCommonDivisor = i;    // Update GCD if i divides both numbers
            }

        }
        System.out.println("The Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + greatestCommonDivisor);
    }
}
