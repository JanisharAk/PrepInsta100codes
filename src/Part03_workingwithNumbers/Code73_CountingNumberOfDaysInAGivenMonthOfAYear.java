package Part03_workingwithNumbers;

import java.time.YearMonth;
import java.util.Scanner;

public class Code73_CountingNumberOfDaysInAGivenMonthOfAYear {
    /*
    Ipuut:
       Enter the year:2024
       Enter the month (1-12): 2
    Output:
      The number of days in FEBRUARY 2024 is: 29
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Input month
        System.out.println("Enter the month (1-12): ");
        int month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        } else {
            // Use YearMonth to determine the number of days
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();

            System.out.println("The number of days in " + yearMonth.getMonth() + " " + year + " is: " + daysInMonth);
        }
    }

}
