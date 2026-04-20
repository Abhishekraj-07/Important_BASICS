/*6. Replace all occurrences of a specific element in an array. */
public class PracticeQno6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        int elementToReplace = 3;
        int replacementElement = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToReplace) {
                arr[i] = replacementElement;
            }
        }

        System.out.println("Array after replacing elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}   