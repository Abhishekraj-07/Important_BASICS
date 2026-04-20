/*8. Count how many elements are even and odd in an array. */
public class PracticeQno8 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}