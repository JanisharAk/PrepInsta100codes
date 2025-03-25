package Part12_AdvancedCodesRelatedToArrays;

import java.math.BigInteger;
import java.util.Scanner;

public class Code16_FindFactorialOfALargeNumber {
        public static BigInteger factorial(int n) {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            scanner.close();

            System.out.println("Factorial of " + n + " is: " + factorial(n));

    }
}
