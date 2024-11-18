package workingwithNumbers;

import java.util.Scanner;

public class Code51_HighestCommonFactor {
    /*
    Input: num1 = 36, num2 = 60
    Output: The Highest Common Factor (HCF) of 36 and 60 is: 12
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Initialize the highest common factor
        int highestCommonFactor = 1; // Start with 1 as the default HCF

        // Find the smaller of the two numbers
        int min = (num1 < num2) ? num1 : num2;

        // Loop to find the common divisors
        for(int i = 1; i <= min; i++){
            if(num1 % i == 0 && num2 % i == 0){  // Check if i divides both num1 and num2
                highestCommonFactor = i;    // Update HCF if i divides both numbers
            }
        }

        // Output the result
        System.out.println("The Highest Common Factor (HCF) of " + num1 + " and " + num2 + " is: " + highestCommonFactor);
    }
}
