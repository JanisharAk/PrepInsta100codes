package Part01_playWithNumber;

import java.util.Scanner;

public class Code01_PositiveOrNegativeNum {

    /*
    here we are going to print positive and negative number
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number: ");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println(num + " is positive");
        }
        else{
            System.out.println(num + " is negative");
        }
    }
}
