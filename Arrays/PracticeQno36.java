/**
 * Question 36: Rearrange array so that positive and negative numbers alternate.
 * Logic: Partitioning followed by interleaved swapping (O(n) time, O(1) space).
 */
public class PracticeQno36 {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        
        rearrange(arr);

        System.out.print("Rearranged Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrange(int[] nums) {
        int n = nums.length;

        // Step 1: Partition - Move all negative elements to the end
        // (Similar to move zeroes, but for negative signs)
        int i = -1;
        for (int j = 0; j < n; j++) {
            if (nums[j] < 0) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Now all negative numbers are from 0 to i
        // All positive numbers are from i+1 to n-1
        int neg = 0;
        int pos = i + 1;

        // Step 2: Swap alternating elements
        // Increment neg by 2 and pos by 1 to interleave
        while (pos < n && neg < pos && nums[neg] < 0) {
            int temp = nums[neg];
            nums[neg] = nums[pos];
            nums[pos] = temp;
            pos++;
            neg += 2;
        }
    }
}