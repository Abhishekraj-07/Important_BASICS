/**
 * Question 34: Count the number of elements greater than a given number.
 * Logic: Linear traversal with a counter (O(n) time, O(1) space).
 */
public class PracticeQno34 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 48, 12, 9, 30};
        int target = 20;

        int result = countGreater(arr, target);
        System.out.println("Number of elements greater than " + target + ": " + result);
    }

    public static int countGreater(int[] nums, int target) {
        if (nums == null) return 0;

        int count = 0;
        for (int num : nums) {
            // Check if the current number is strictly greater than the target
            if (num > target) {
                count++;
            }
        }
        return count;
    }
}