package importantCodesRelatedToArrays_5Part;

import java.util.Scanner;

public class Code113_CountingTheNumberOfEvenAndOddElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i  = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }

        }
        System.out.println("The number of even numbers is: " + evenCount);
        System.out.println("The number of odd numbers is: " + oddCount);

    }
}
