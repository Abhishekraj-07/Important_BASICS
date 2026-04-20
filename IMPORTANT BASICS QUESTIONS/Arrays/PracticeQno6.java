/*6. Find the second maximum element in an array. */
public class PracticeQno6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("The second maximum element in the array is: " + secondMax);
    }

}
