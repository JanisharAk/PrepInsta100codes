package Part01_playWithNumber;

import java.util.Scanner;

public class Code06_GreatestOfTwoNum {
    public static void main(String[] args) {
        /*
        we will identify the greatest of two number
         */
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
//        System.out.println("=======first method============");

//        int greatest = num1 > num2 ? num1 : num2;
//        System.out.println("The greatest number is " + greatest);

//        System.out.println("=======Second method============");

        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num1 < num2){
            System.out.println(num2 + " is greater than " + num1);
        }

    }
}
