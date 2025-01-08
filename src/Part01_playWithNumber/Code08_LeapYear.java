package Part01_playWithNumber;

import java.util.Scanner;

public class Code08_LeapYear {
    /*
    Here we have to find the leap year
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
