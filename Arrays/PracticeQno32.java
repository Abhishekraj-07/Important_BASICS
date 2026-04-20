import java.util.HashSet;

/**
 * Question 32: Find all pairs of elements whose sum is equal to a given number.
 * Logic: Using a HashSet for linear time complexity (O(n)).
 */
public class PracticeQno32 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;

        findPairs(arr, targetSum);
    }

    public static void findPairs(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            System.out.println("No pairs possible.");
            return;
        }

        // HashSet to store numbers we have already seen
        HashSet<Integer> seen = new HashSet<>();
        boolean found = false;

        System.out.println("Pairs with sum " + target + ":");
        for (int num : nums) {
            int complement = target - num;

            // If the complement exists in the set, we found a pair
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
                found = true;
            }

            // Add the current number to the set for future pairs
            seen.add(num);
        }

        if (!found) {
            System.out.println("No pairs found with the given sum.");
        }
    }
}