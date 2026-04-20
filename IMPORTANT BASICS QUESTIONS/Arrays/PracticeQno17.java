/*17. Find the second maximum element in an array. */
public class PracticeQno17 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 1};
        int secondMax = findSecondMaximum(arr);
        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("The second maximum element is: " + secondMax);
        } else {
            System.out.println("There is no second maximum element.");
        }
    }

    public static int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

}
