package importantCodesRelatedToArrays_5Part;

public class Code126_FindingCircularRotationOfAnArrayByKPositions {
    /*
    A circular rotation of an array involves shifting the array elements by
    k positions such that the last elements wrap around to the start of the
    array (right rotation) or the first elements wrap around to the end
    (left rotation). The operation ensures that the array remains intact but
    appears shifted

    Left rotation -
    Input: arr = [1, 2, 3, 4, 5], int k = 2
    Output: [3, 4, 5, 1, 2]

    Right rotation -
    Input: arr = [1, 2, 3, 4, 5], int k = 2
    Output: [4, 5, 1, 2, 3]
     */
    // Function to left rotate the array by k positions
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle k > n

        reverse(arr, 0, k - 1);       // Reverse the first k elements
        reverse(arr, k, n - 1);       // Reverse the remaining elements
        reverse(arr, 0, n - 1);       // Reverse the entire array
    }

    // Function to right rotate the array by k positions
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle k > n

        reverse(arr, n - k, n - 1);   // Reverse the last k elements
        reverse(arr, 0, n - k - 1);   // Reverse the first n-k elements
        reverse(arr, 0, n - 1);       // Reverse the entire array
    }

    // Utility function to reverse an array segment
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array:");
        printArray(arr);

        leftRotate(arr, k);
        System.out.println("Array after Left Rotation by " + k + ":");
        printArray(arr);

        // Reset the array for right rotation
        int[] arr2 = {1, 2, 3, 4, 5};
        rightRotate(arr2, k);
        System.out.println("Array after Right Rotation by " + k + ":");
        printArray(arr2);
    }

    // Utility function to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
