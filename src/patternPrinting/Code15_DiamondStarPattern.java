package patternPrinting;

import java.util.Scanner;

public class Code15_DiamondStarPattern {
    /*

        *
       ***
      *****
     *******
      *****
       ***
        *

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No");
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=n; j>i+1; j--)
                System.out.print(" ");
            for (int j=0; j<=i*2; j++ )
                System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for(int k=n;k>i;k--)
                System.out.print(" ");
            for(int j=0;j<i*2-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
