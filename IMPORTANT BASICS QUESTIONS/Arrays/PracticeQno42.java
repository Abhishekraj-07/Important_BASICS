/**
 * Question 42: Find the element that appears only once while others appear twice.
 * Logic: Bitwise XOR operation (O(n) time, O(1) space).
 */
public class PracticeQno42 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        
        int unique = findSingleElement(arr);
        System.out.println("The element that appears once is: " + unique);
    }

    public static int findSingleElement(int[] nums) {
        int result = 0;
        
        // XOR all elements in the array
        for (int num : nums) {
            result = result ^ num;
        }
        
        return result;
    }
}   