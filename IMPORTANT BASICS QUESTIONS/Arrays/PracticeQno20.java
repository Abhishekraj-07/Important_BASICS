/*20. Find the second smallest element in an array. */
public class PracticeQno20 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 1};
        int secondSmallest = findSecondSmallest(arr);
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest element.");
        }
    }

    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }
}
