/*18. Sort an array in descending order. */
public class PracticeQno18 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        sortDescending(arr);
        System.out.println("Sorted array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
