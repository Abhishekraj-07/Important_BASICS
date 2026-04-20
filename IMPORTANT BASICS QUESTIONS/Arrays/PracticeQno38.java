import java.util.HashSet;

/**
 * Question 38: Find the intersection of two arrays.
 * Logic: Using HashSet for linear time complexity O(N + M).
 */
public class PracticeQno38 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 4};
        int[] arr2 = {2, 2, 4, 6};

        findIntersection(arr1, arr2);
    }

    public static void findIntersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Add all elements from the first array to a set
        for (int num : nums1) {
            set.add(num);
        }

        // Check if elements of the second array exist in the set
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num); // Use a second set to avoid duplicate results
            }
        }

        System.out.println("Intersection of arrays: " + intersection);
    }
}