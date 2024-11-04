package playWithNumber;

import java.util.Scanner;

public class FactorOfaNumber {
    /*
    we have to find the factor of a number
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            factor *= i;
        }
        System.out.println("Factor of " +num+ " is "+ factor);
    }
}
/*
output:-
Enter an integer: 4
Factor of 4 is 24
 */