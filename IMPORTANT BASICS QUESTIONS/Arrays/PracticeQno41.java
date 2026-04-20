/**
 * Question 41: Find the duplicate number in an array (with one duplicate).
 * Logic: Floyd's Tortoise and Hare (Cycle Detection) - O(n) time, O(1) space.
 */
public class PracticeQno41 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2}; // 2 is the duplicate
        
        int duplicate = findDuplicate(arr);
        System.out.println("The duplicate number is: " + duplicate);
    }

    public static int findDuplicate(int[] nums) {
        if (nums.length <= 1) return -1;

        // Phase 1: Finding the intersection point in the cycle
        int tortoise = nums[0];
        int hare = nums[0];

        do {
            tortoise = nums[tortoise];      // Moves 1 step
            hare = nums[nums[hare]];       // Moves 2 steps
        } while (tortoise != hare);

        // Phase 2: Finding the entrance to the cycle (the duplicate)
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}