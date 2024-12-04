package codesForRecursion;

import java.util.Scanner;

public class Code86_IntegerNTheTaskIsToPrintTheFthTerm {
    /*
    F(N) Refers to the Fibonacci Sequence
    */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case
        }
        if (n == 1) {
            return 1; // Base case
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci term F(" + n + ") = " + fibonacci(n));
    }
}
