/**
 * Question 37: Find the majority element (element occurring more than n/2 times).
 * Logic: Boyer-Moore Voting Algorithm (O(n) time, O(1) space).
 */
public class PracticeQno37 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        
        int result = findMajority(arr);
        
        if (result != -1) {
            System.out.println("The majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }

    public static int findMajority(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate (Crucial for arrays where a majority might not exist)
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element exists
        }
    }
}