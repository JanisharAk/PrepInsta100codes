package codesForRecursion;

public class Code83_LCMOfTwoNumbers {
    // Recursive method to find GCD
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to find LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int lcm = lcm(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

}
