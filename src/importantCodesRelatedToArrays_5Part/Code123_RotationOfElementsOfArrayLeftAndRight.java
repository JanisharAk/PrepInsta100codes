package importantCodesRelatedToArrays_5Part;

import java.util.Arrays;
import java.util.Scanner;

public class Code123_RotationOfElementsOfArrayLeftAndRight {
    /*
    arr = {2,3,1,7,6}
    rotate right by 2
    output : {7,6,2,3,1}

     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 3,  8, 9, 4, 7 };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to rotate by K: ");
        int k = sc.nextInt();

        // handle test cases, If k > element
        k = k % n;

        //
        for(int i = 0; i < n; i++){
            if(i<k)
            {
                // Printing rightmost
                // kth elements
                System.out.print(arr[n + i - k]
                        + " ");// if  = 3, then it print {9, 4, 7}
            }
            else
            {
                // Prints array after
                // 'k' elements
                System.out.print(arr[i - k]
                        + " ");
            }
        }

    }
}
