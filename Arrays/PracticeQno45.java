import java.util.HashSet;

/**
 * Question 45: Find the length of the longest sub array with all distinct elements.
 * Logic: Sliding Window Technique (O(n) time, O(k) space where k is unique elements).
 */
public class PracticeQno45 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4, 7};
        
        int maxLength = findLongestDistinctSubarray(arr);
        System.out.println("Length of longest subarray with distinct elements: " + maxLength);
    }

    public static int findLongestDistinctSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            // If we find a duplicate, shrink the window from the left
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                left++;
            }

            // Add the current element and update maxLen
            set.add(nums[right]);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}