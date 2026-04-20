/*21. Remove duplicates from an array. */
public class PracticeQno21 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 4, 5 };
        int len = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int j = 0; // Pointer for the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            // If current element is different from the last unique element
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i]; // Move it to the next unique position
            }
        }
        // Return the number of unique elements
        return j + 1;
    }
}
