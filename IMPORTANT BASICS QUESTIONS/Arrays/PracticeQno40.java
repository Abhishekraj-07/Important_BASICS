/**
 * Question 40: Find the missing number in a sequence from 1 to n.
 * Logic: Mathematical Sum Formula (O(n) time, O(1) space).
 */
public class PracticeQno40 {
    public static void main(String[] args) {
        // n is the range (1 to 6), but one number is missing
        int n = 6; 
        int[] arr = {1, 2, 4, 5, 6}; // 3 is missing

        int missing = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missing);
    }

    public static int findMissingNumber(int[] nums, int n) {
        // Step 1: Calculate the sum of first n natural numbers
        // Formula: n * (n + 1) / 2
        int expectedSum = n * (n + 1) / 2;

        // Step 2: Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The difference is the missing number
        return expectedSum - actualSum;
    }
}