import java.util.HashMap;

/**
 * Question 44: Count the number of sub arrays with a given sum.
 * Logic: Prefix Sum + HashMap (O(n) time, O(n) space).
 */
public class PracticeQno44 {
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int target = -10;

        int count = countSubarraysWithSum(arr, target);
        System.out.println("Total subarrays with sum " + target + " is: " + count);
    }

    public static int countSubarraysWithSum(int[] nums, int target) {
        // Map to store (prefixSum, countOfOccurrences)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: A prefix sum of 0 has occurred once (before the first element)
        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - target) exists in map, it means we found 
            // a subarray (or multiple) ending here that sums to 'target'
            if (map.containsKey(currentSum - target)) {
                count += map.get(currentSum - target);
            }

            // Update the map with the current prefix sum
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}