/**
 * Question 35: Move all zeroes to the end without changing order of other elements.
 * Logic: Two-pointer approach (O(n) time, O(1) space).
 */
public class PracticeQno35 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        
        moveZeroes(arr);

        System.out.print("Array after moving zeroes: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0; // Pointer to track where the next non-zero goes

        // Step 1: Shift all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Step 2: Fill the remaining positions with zeroes
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}