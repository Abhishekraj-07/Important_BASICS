/**
 * Question 27: Find the smallest three elements in an array.
 * Logic: Single pass maintenance of three variables (O(n) time, O(1) space).
 */
public class PracticeQno27 {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        findThreeSmallest(arr);
    }

    public static void findThreeSmallest(int[] nums) {
        if (nums.length < 3) {
            System.out.println("Invalid Input: Array size should be at least 3.");
            return;
        }

        // Initialize with the largest possible integer value
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int num : nums) {
            // 1. If current element is smaller than first
            if (num < first) {
                third = second;
                second = first;
                first = num;
            } 
            // 2. If current element is between first and second
            else if (num < second && num != first) {
                third = second;
                second = num;
            } 
            // 3. If current element is between second and third
            else if (num < third && num != second && num != first) {
                third = num;
            }
        }

        if (third == Integer.MAX_VALUE) {
            System.out.println("Not enough distinct elements found.");
        } else {
            System.out.println("Three smallest elements are: " + first + ", " + second + ", " + third);
        }
    }
}