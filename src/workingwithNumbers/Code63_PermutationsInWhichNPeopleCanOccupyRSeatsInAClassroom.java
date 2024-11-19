package workingwithNumbers;

import java.util.Scanner;

interface Code63_PermutationsInWhichNPeopleCanOccupyRSeatsInAClassroom {
    /*
    Enter the total number of people (n): 5
    Enter the number of seats (r): 3
    Output 1:The number of permutations in which 5 people can occupy 3 seats is: 60
     */

    // Function to calculate factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate the number of permutations
     static long permutations(int n, int r) {
        if (r > n) {
            return 0; // If r > n, it's not possible to arrange r people in n seats
        }
        return factorial(n) / factorial(n - r); // Using the permutation formula
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n and r
        System.out.print("Enter the total number of people (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of seats (r): ");
        int r = sc.nextInt();

        // Calculate permutations
        long result = permutations(n, r);

        // Output the result
        System.out.println("The number of permutations in which " + n + " people can occupy " + r + " seats is: " + result);
    }
}
