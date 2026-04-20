/* 3. Find the maximum/minimum element in an array. */
public class PracticeQno3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The maximum element in the array is: " + max);
        System.out.println("The minimum element in the array is: " + min);
    }

}
