/**
 * Question 28: Find the sum of even and sum of odd elements separately.
 * Logic: Single pass traversal with parity check (O(n) time, O(1) space).
 */
public class PracticeQno28 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        findEvenOddSum(arr);
    }

    public static void findEvenOddSum(int[] nums) {
        long evenSum = 0;
        long oddSum = 0;

        for (int num : nums) {
            // Check if the number is even
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                // Otherwise it is odd
                oddSum += num;
            }
        }

        System.out.println("Sum of even elements: " + evenSum);
        System.out.println("Sum of odd elements: " + oddSum);
    }
}