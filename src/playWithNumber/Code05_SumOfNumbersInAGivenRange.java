package playWithNumber;

import java.util.Scanner;

public class Code05_SumOfNumbersInAGivenRange {
    public static void main(String[] args) {

        /*
        we have to find the sum of the numbers within range so we will iterate
        from where it start to where it ends
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = sc.nextInt();
        int sum = 0;
        for(int i = firstNum; i <= secondNum; i++){
            sum += i;
        }
        System.out.println("Sum of the nummber in a range is "+sum);
    }
}
/*
Enter the first number:
2
Enter the second number:
5
Sum of the nummber in a range is 14
 */