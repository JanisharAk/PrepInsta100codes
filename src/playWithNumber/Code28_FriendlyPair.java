package playWithNumber;

import java.util.Scanner;

public class Code28_FriendlyPair {
    /*
    A friendly pair (or amicable pair) consists of two numbers
    where the sum of the proper divisors (excluding the number itself)
    of each number is equal to the other number. In other words, for two numbers
     a and b, they are a friendly pair if
     */
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate the sum of divisors of each number
        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        // Check if the numbers form a friendly pair
        if (sum1 == num2 && sum2 == num1) {
            System.out.println(num1 + " and " + num2 + " are a friendly pair.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not a friendly pair.");
        }

        sc.close();
    }
}
/*
Example:====
Consider the numbers 220 and 284:

Proper divisors of 220: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110.
Sum of these divisors: 1+2+4+5+10+11+20+22+44+55+110=284.
Proper divisors of 284: 1, 2, 4, 71, 142.
Sum of these divisors: 1+2+4+71+142=220.
Since the sum of the divisors of 220 is 284 and vice versa, 220 and 284 form a friendly pair.
 */