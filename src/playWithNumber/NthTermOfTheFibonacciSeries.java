package playWithNumber;

import java.util.Scanner;

public class NthTermOfTheFibonacciSeries {
    /*
    To solve this code we can use iteration as well as recursion
    but we will use iteration here
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int num = sc.nextInt();

        int a = 0, b = 1;

        // Here we are printing 0th and 1st terms
        System.out.print(a + " , " + b);

        int nextTerm;

        // printing the rest of the terms here
        for (int i = 2; i < num; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(" , " + nextTerm);
        }

        sc.close();
    }
}
