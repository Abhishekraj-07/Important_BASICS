/*17. Sort an array in ascending order. */
public class PracticeQno17 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 1};
        System.out.println("Original array:");
        printArray(arr);
        sortArray(arr);
        System.out.println("Array after sorting:");
        printArray(arr);
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}