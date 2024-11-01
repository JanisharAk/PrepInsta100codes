package playWithNumber;

import java.util.Scanner;

public class ReverseOfaNumber {
    /*
    here we will reverse a number
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reverse);
        scanner.close();
    }
}
/*
while loop logic
It takes the last digit of the number using number % 10.
Builds the reversed number by shifting the existing digits of reverse left by one place (reverse * 10) and adding the extracted digit.
Removes the last digit from number by dividing it by 10.
 */