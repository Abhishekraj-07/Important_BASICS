/**
 * Question 33: Check if an array is sorted (ascending).
 * Logic: Linear comparison of adjacent elements (O(n) time, O(1) space).
 */
public class PracticeQno33 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 20, 15, 40, 50};

        System.out.println("Is arr1 sorted? " + isSorted(arr1));
        System.out.println("Is arr2 sorted? " + isSorted(arr2));
    }

    public static boolean isSorted(int[] nums) {
        // Edge case: Empty array or single element is technically sorted
        if (nums == null || nums.length <= 1) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            // If any element is greater than the one after it, it's not sorted
            if (nums[i] > nums[i + 1]) {
                return false; 
            }
        }

        // If we finish the loop without returning false, it's sorted
        return true;
    }
}