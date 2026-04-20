/**
 * Question 24: Rotate an array by k positions to the right.
 * Logic: Reversal Algorithm (In-Place)
 */
public class PracticeQno24 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateRight(arr, k);

        // Expected Output for k=3: 5 6 7 1 2 3 4
        System.out.print("Right Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateRight(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        // Ensure k is within bounds
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}