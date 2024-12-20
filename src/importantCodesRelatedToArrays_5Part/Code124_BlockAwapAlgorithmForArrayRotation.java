package importantCodesRelatedToArrays_5Part;

public class Code124_BlockAwapAlgorithmForArrayRotation {
    /*
    The Block Swap Algorithm is an efficient method for rotating an array.
    It works by dividing the array into two parts (blocks) and swapping elements
    between them. This algorithm is particularly useful for in-place rotation,
    avoiding the use of additional space.
     */

    public static void leftRotate(int arr[], int d,
                                  int n)
    {
        leftRotateRec(arr, 0, d, n);
    }

    public static void leftRotateRec(int arr[], int i,
                                     int d, int n)
    {
        /* Return If number of elements to be rotated
        is zero or equal to array size */
        if(d == 0 || d == n)
            return;

        /*If number of elements to be rotated
        is exactly half of array size */
        if(n - d == d)
        {
            swap(arr, i, n - d + i, d);
            return;
        }

        /* If A is shorter*/
        if(d < n - d)
        {
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);
        }
        else /* If B is shorter*/
        {
            swap(arr, i, d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
        }
    }

    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    public static void printArray(int arr[], int size)
    {
        int i;
        for(i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /*This function swaps d elements
    starting at index fi with d elements
    starting at index si */
    public static void swap(int arr[], int fi,
                            int si, int d)
    {
        int i, temp;
        for(i = 0; i < d; i++)
        {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 2, 7);
        printArray(arr, 7);
    }
}
/*
Example:
Input: arr = [1, 2, 3, 4, 5, 6, 7]
Rotate by k = 3
Steps:
Divide the array:

Block A: [1, 2, 3]
Block B: [4, 5, 6, 7]
Compare sizes:

Block A (k = 3) and Block B (n-k = 4).
Since A is smaller, swap the first 3 elements of Block B with Block A.
After the swap:

arr = [4, 5, 6, 7, 1, 2, 3]
Repeat for the remaining part of Block B:

New Block A: [4] (remaining part of original Block B)
New Block B: [1, 2, 3]
Swap Block A and Block B.

Final array: [4, 5, 6, 7, 1, 2, 3].
 */
