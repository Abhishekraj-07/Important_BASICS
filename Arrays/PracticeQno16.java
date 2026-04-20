/*16. Shift all elements of an array to the right by one position. */
public class PracticeQno16 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array:");
        printArray(arr);
        shiftRight(arr);
        System.out.println("Array after right shift:");
        printArray(arr);
    }

    public static void shiftRight(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

    

  