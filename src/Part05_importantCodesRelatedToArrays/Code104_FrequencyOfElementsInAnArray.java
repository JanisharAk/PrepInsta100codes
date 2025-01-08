package Part05_importantCodesRelatedToArrays;

import java.util.Scanner;

public class Code104_FrequencyOfElementsInAnArray {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       // Prompting user to enter the size of the array
       System.out.print("Enter the size of the array: ");
       int n = sc.nextInt();

       // Array initialization and input
       int[] arr = new int[n];
       System.out.println("Enter " + n + " elements of the array:");
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }

       // To keep track of visited elements and their frequencies
       boolean[] visited = new boolean[n];

       // Traverse through the array to count the frequency of each element
       for (int i = 0; i < n; i++) {
           // Skip the element if it is already counted
           if (visited[i]) {
               continue;
           }

           int count = 1;
           // Count frequency of arr[i]
           for (int j = i + 1; j < n; j++) {
               if (arr[i] == arr[j]) {
                   visited[j] = true; // Mark element as visited
                   count++;
               }
           }

           // Print the element and its frequency
           System.out.println(arr[i] + " appears " + count + " times.");

       }
   }
}
