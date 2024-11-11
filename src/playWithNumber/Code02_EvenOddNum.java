package playWithNumber;

import java.util.Scanner;

public class Code02_EvenOddNum {
    public static void main(String[] args) {

        /*
        here we are using scanner classes for taking any input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
/*
Enter the number:
4
even number
Enter the number:
3
Odd number
 */

