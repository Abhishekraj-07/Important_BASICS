/**
 * Question 43: Find the sub array with maximum sum.
 * Logic: Kadane's Algorithm (O(n) time, O(1) space).
 */
public class PracticeQno43 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int maxSum = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }

    public static int maxSubArray(int[] nums) {
        // Initialize with the first element
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            // Add current element to the running sum
            currentSum += num;

            // Update maxSum if currentSum is better
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If sum becomes negative, discard it and reset to zero
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
}