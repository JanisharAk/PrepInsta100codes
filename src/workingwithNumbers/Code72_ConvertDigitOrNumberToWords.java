package workingwithNumbers;

import java.util.Scanner;

public class Code72_ConvertDigitOrNumberToWords {
    /*
    Convert digits or numbers to words
    */
    // Arrays for mapping digits and numbers
    private static final String[] units = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Number in words: Zero");
        } else {
            System.out.println("Number in words: " + convertToWords(number));
        }
    }

    // Method to convert a number to words
    public static String convertToWords(int number) {
        if (number < 0) {
            return "Minus " + convertToWords(-number); // Handle negative numbers
        }

        if (number < 10) {
            return units[number];
        }

        if (number < 20) {
            return teens[number - 10];
        }

        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
        }

        if (number < 1000) {
            return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " and " + convertToWords(number % 100) : "");
        }

        if (number < 1000000) {
            return convertToWords(number / 1000) + " Thousand" + ((number % 1000 != 0) ? " " + convertToWords(number % 1000) : "");
        }

        if (number < 1000000000) {
            return convertToWords(number / 1000000) + " Million" + ((number % 1000000 != 0) ? " " + convertToWords(number % 1000000) : "");
        }

        return convertToWords(number / 1000000000) + " Billion" + ((number % 1000000000 != 0) ? " " + convertToWords(number % 1000000000) : "");
    }
}
