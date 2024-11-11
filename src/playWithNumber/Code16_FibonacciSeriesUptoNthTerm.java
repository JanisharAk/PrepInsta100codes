package playWithNumber;

import java.util.Scanner;

public class Code16_FibonacciSeriesUptoNthTerm {
    /*
    This program calculates the Fibonacci series up to the nth term.
    The Fibonacci series is a sequence of numbers in which each number is the sum of the two preceding ones.
    The series starts with 0 and 1: 0, 1, 1, 2, 3, 5, 8, 13, ...
    */
    public static void main(String[] args) {
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            int temp = first + second;  // Calculate the next term
            first = second;              // Move `first` to the next term
            second = temp;               // Move `second` to the next term
            System.out.print(first + " ");
        }
        sc.close();
    }
}
