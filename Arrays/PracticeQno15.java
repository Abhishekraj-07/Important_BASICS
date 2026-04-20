/*15. Shift all elements of an array to the left by one position. */
public class PracticeQno15 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array:");
        printArray(arr);
        shiftLeft(arr);
        System.out.println("Array after left shift:");
        printArray(arr);
    }

    public static void shiftLeft(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
