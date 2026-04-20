/**
 * Question 26: Find the largest three elements in an array.
 * Logic: Single pass maintenance of three variables (O(n) time, O(1) space).
 */
public class PracticeQno26 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        findThreeLargest(arr);
    }

    public static void findThreeLargest(int[] nums) {
        if (nums.length < 3) {
            System.out.println("Array size is less than 3.");
            return;
        }

        // Initialize with the smallest possible integer value
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : nums) {
            // If current element is greater than first
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } 
            // If current element is between first and second
            else if (num > second && num != first) {
                third = second;
                second = num;
            } 
            // If current element is between second and third
            else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Three largest elements are: " + first + ", " + second + ", " + third);
    }
}