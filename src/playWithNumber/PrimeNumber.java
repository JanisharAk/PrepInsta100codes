package playWithNumber;

import java.util.Scanner;

public class PrimeNumber {
    /*
    we have to find prime number of any given number
    Prime number is divisible by two number either 1 or itself
    there will be two divisible. So we've counted and then compare. If its two then
    it is prime number or not a prime.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }if(count == 2){
            System.out.println("Given number is a Prime Number");
        }
        else{
            System.out.println("Given number is a Not Prime Number");
        }
    }
}
/*
Enter a number:
7
Given number is a Prime Number
 */