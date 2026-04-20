import java.util.HashSet;

/**
 * Question 39: Find the union of two arrays.
 * Logic: Using a HashSet to automatically handle duplicates (O(N + M) time).
 */
public class PracticeQno39 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        findUnion(arr1, arr2);
    }

    public static void findUnion(int[] nums1, int[] nums2) {
        // HashSet stores only unique elements
        HashSet<Integer> unionSet = new HashSet<>();

        // Add all elements from the first array
        for (int num : nums1) {
            unionSet.add(num);
        }

        // Add all elements from the second array
        for (int num : nums2) {
            unionSet.add(num);
        }

        // Output the union
        System.out.println("Union of arrays: " + unionSet);
        System.out.println("Total number of unique elements: " + unionSet.size());
    }
}