package Part01_playWithNumber;

import java.util.Scanner;

public class Code07_GreatestOfThreeNum {
    /*
    we will find greatest of three digit using if else condition
    and comparing each one with another two
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greater than num2 and num3" );
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is greater than num1 and num3" );
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println(num3 + " is greater than num1 and num2" );
        }
    }
}
