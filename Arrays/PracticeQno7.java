/*7. Check if an array contains a specific element. */
public class PracticeQno7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToFind = 3;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + elementToFind + " is present in the array.");
        } else {
            System.out.println("Element " + elementToFind + " is not present in the array.");
        }
    }
}
     