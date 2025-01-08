package Part03_workingwithNumbers;

import java.util.Scanner;

public class Code76_RootOfQuadraticEquation {
    public static void main(String[] args) {
        /*
        Input:
        Enter the coefficient a: 1
        Enter the coefficient b: 1
        Enter the coefficient c: 1
       Output:
        The roots are complex and imaginary.
        Root 1: -0.5 + 0.8660254037844386i
        Root 2: -0.5 - 0.8660254037844386i
         */
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Check if 'a' is zero
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        } else {
            // Calculate the discriminant
            double discriminant = b * b - 4 * a * c;

            // Check the nature of the discriminant
            if (discriminant > 0) {
                // Two real and distinct roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The roots are real and distinct.");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                // One real and repeated root
                double root = -b / (2 * a);
                System.out.println("The roots are real and repeated.");
                System.out.println("Root: " + root);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The roots are complex and imaginary.");
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }

        scanner.close();
    }
}
