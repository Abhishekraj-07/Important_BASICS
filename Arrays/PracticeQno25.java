/**
 * Question 25: Rotate an array by k positions to the left.
 * Logic: Reversal Algorithm (In-Place)
 */
public class PracticeQno25 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateLeft(arr, k);

        // Expected Output for k=2: 3 4 5 1 2
        System.out.print("Left Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        // Handle cases where k > n
        k = k % n;

        // 1. Reverse the first k elements [0 to k-1]
        reverse(nums, 0, k - 1);
        
        // 2. Reverse the rest of the elements [k to n-1]
        reverse(nums, k, n - 1);
        
        // 3. Reverse the entire array [0 to n-1]
        reverse(nums, 0, n - 1);
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