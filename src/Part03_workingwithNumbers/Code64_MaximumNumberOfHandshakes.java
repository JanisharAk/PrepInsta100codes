package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code64_MaximumNumberOfHandshakes {

    /*
    Maximum Handshakes=(
     (n/2)=n(n−1)/2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of people
        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = (n * (n - 1)) / 2;

        // Output the result
        System.out.println("The maximum number of handshakes among " + n + " people is: " + maxHandshakes);
    }

}
