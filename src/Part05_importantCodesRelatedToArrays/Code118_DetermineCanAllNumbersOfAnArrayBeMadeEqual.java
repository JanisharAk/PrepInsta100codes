package Part05_importantCodesRelatedToArrays;

public class Code118_DetermineCanAllNumbersOfAnArrayBeMadeEqual {
    public static void main(String[] args) {
        System.out.println("Original Array:");
        int[] arr = {2, 4, 5, 6, 9, 10};

        // Check if all numbers can be made equal
        boolean canBeMadeEqual = canMakeArrayEqual(arr);

        if (canBeMadeEqual) {
            System.out.println("Yes, all elements can be made equal.");
        } else {
            System.out.println("No, all elements cannot be made equal.");
        }
    }

    // Method to determine if all numbers in the array can be made equal
    public static boolean canMakeArrayEqual(int[] arr) {
        // Define the step size for modification (example: step size = 1)
        int stepSize = 1;

        // Compute the remainder of the first element when divided by stepSize
        int baseRemainder = arr[0] % stepSize;

        // Check if all other elements have the same remainder
        for (int num : arr) {
            if (num % stepSize != baseRemainder) {
                return false; // Remainders mismatch
            }
        }
        return true; // All elements have the same remainder
    }
}
/*
Example with Step Size
k=2:
Array: [4, 6, 8]

Compute remainders:

4mod2=0,
6mod2=0,
8mod2=0.
All remainders are the same, so the numbers can be made equal.

Example Where They Cannot Be Equal:
Array: [4, 6, 7], Step Size
k=2:

Compute remainders:
4mod2=0,
6mod2=0,
7mod2=1.
The remainders are not the same, so the numbers cannot be made equal.

 */