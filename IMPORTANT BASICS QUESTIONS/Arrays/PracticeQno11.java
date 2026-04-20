/*11. Find the maximum element in an array. */
public class PracticeQno11 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        int max = findMax(arr);
        System.out.println("The maximum element in the array is: " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        return max;
    }
}
