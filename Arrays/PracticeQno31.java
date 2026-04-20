/**
 * Question 31: Find the difference between the largest and smallest element.
 * Logic: Single pass to find Min and Max (O(n) time, O(1) space).
 */
public class PracticeQno31 {
    public static void main(String[] args) {
        int[] arr = {15, 2, 34, 8, 19, 1};
        
        int difference = findRange(arr);
        System.out.println("The difference is: " + difference);
    }

    public static int findRange(int[] nums) {
        if (nums == null || nums.length < 2) {
            System.out.println("Array must have at least two elements.");
            return 0;
        }

        // Initialize min and max with the first element
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Return the difference (Range)
        return max - min;
    }
}