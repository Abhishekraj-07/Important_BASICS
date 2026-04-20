/**
 * Question 29: Replace negative numbers with zero.
 * Logic: In-place traversal and modification (O(n) time, O(1) space).
 */
public class PracticeQno29 {
    public static void main(String[] args) {
        int[] arr = {10, -5, 2, -8, -1, 7, 0};

        replaceNegatives(arr);

        System.out.print("Modified Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void replaceNegatives(int[] nums) {
        if (nums == null) return;

        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is less than zero
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }
    }
}