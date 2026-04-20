/*7. Find the second minimum element in an array. */
public class PracticeQno7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];
        int secondMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        System.out.println("The second minimum element in the array is: " + secondMin);
    }

}
