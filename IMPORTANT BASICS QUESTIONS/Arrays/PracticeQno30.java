/**
 * Question 30: Replace all zeroes with ones.
 * Logic: Linear traversal and in-place replacement (O(n) time, O(1) space).
 */
public class PracticeQno30 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};

        replaceZeroes(arr);

        System.out.print("Modified Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void replaceZeroes(int[] nums) {
        if (nums == null) return;

        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is exactly zero
            if (nums[i] == 0) {
                nums[i] = 1;
            }
        }
    }
}