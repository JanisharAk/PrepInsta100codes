package Part01_playWithNumber;

import java.util.Scanner;

public class Code24_PerfectSquare {
    /*
    A perfect square is an integer that is the square of another integer.
    In other words, if you multiply an integer by itself, the result is a
    perfect square.

Definition
A number 𝑛 n is a perfect square if there exists an integer 𝑚
m such that: n=m×m=m^2

Examples
16 is a perfect square because 4×4=16.
25 is a perfect square because 5×5=25.
36 is a perfect square because 6×6=36.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        sc.close();
    }
}
