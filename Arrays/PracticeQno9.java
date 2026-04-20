/*9. Separate even and odd elements in an array. */
public class PracticeQno9 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenElements = new int[arr.length];
        int[] oddElements = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenElements[evenIndex++] = arr[i];
            } else {
                oddElements[oddIndex++] = arr[i];
            }
        }

        System.out.println("Even elements:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenElements[i] + " ");
        }

        System.out.println("\nOdd elements:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddElements[i] + " ");
        }
    }
}