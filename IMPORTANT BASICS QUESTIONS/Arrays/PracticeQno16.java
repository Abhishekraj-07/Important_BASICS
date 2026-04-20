/*16. Find the minimum element in an array. */
public class PracticeQno16 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int min = findMinimum(arr);
        System.out.println("The minimum element in the array is: " + min);
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0]; // Assume the first element is the minimum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }
        return min;
    }
}
