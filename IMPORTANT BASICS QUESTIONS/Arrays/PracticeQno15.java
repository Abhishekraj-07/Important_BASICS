/*15. Find the maximum element in an array. */
public class PracticeQno15 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int max = findMaximum(arr);
        System.out.println("The maximum element in the array is: " + max);
    }

    public static int findMaximum(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        return max;
    }
}
