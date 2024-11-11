package playWithNumber;

import java.util.Scanner;

public class Code03_SumFirstNnaturalNum {

    //We will find Sum of First N Natural Numbers in Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num1; i++){
            sum = sum + i;// stroing th value to sum
        }
        System.out.println("The sum is: " + sum);
    }
}
/*
Enter the first number:
4
The sum is: 10
4 = 1 + 2 + 3 + 4 : 10
 */

