package Part12_AdvancedCodesRelatedToArrays;

public class Code07_MinimumNoOfJumpsToReachTheEndOfAarray {
    /*
    Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
    Output: 3 (1-> 3 -> 9 -> 9)
    Explanation: Jump from 1st element to 2nd element as there is only 1 step, now
    there are three options 5, 8 or 9. If 8 or 9 is chosen then the end node 9 can
    be reached. So 3 jumps are made.
     */
    public static int minJumps(int[] arr) {
        if (arr.length <= 1) return 0; // If already at the end, no jumps needed
        if (arr[0] == 0) return -1; // If the first element is 0, cannot move

        int jumps = 1;  // Number of jumps taken
        int maxReach = arr[0]; // Maximum reachable index
        int steps = arr[0]; // Steps we can still take

        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1) return jumps; // If we reached the last index

            maxReach = Math.max(maxReach, i + arr[i]); // Update maxReach
            steps--; // Use one step

            if (steps == 0) { // If no steps left
                jumps++; // Take another jump
                if (i >= maxReach) return -1; // If we can't move forward
                steps = maxReach - i; // Reset steps to the maxReach range
            }
        }

        return -1; // If end is never reached
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Minimum jumps needed: " + minJumps(arr));
    }
}
