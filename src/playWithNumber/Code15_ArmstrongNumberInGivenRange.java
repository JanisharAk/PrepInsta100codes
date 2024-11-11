package playWithNumber;

import java.util.Scanner;

public class Code15_ArmstrongNumberInGivenRange {
    /*
    This program finds all Armstrong numbers in a given range.
    Approach will be similar as I have find other question based on ranges.
    By using another boolean method
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Armstrong numbers between " + num1 + " and " + num2 + ":");

        for (int i = num1; i <= num2; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    // Helper method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length(); //String.valueOf(num) converts
        // the integer num into its string representation. For example, if num is 153,
        // then String.valueOf(num) would return the string "153"

        // Calculate the sum of digits raised to the power of numberOfDigits
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNum;
    }
}

/*
output:======================
Enter First Number: 150
Enter Second Number: 160
Armstrong numbers between 150 and 160:
153

 */