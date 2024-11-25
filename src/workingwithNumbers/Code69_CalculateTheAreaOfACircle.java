package workingwithNumbers;

import java.util.Scanner;

public class Code69_CalculateTheAreaOfACircle {
    /*
    area
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextInt();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle of the given radius is " + area);

    }
}
