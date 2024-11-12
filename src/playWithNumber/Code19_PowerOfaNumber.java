package playWithNumber;

import java.util.Scanner;

public class Code19_PowerOfaNumber {
    /*
    Calculate the power of a number (base^power)
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base integer: ");
        int base = sc.nextInt();
        System.out.print("Enter power integer: ");
        int power = sc.nextInt();

        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base; // Multiply result by base each time
        }
        System.out.println(base + " raised to the power of " + power + " is: " + result);
        sc.close();
    }
}
