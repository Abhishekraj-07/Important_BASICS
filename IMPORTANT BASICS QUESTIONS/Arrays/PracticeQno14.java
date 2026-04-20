/*14. Find the average of all elements in an array. */
public class PracticeQno14 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        double average = findAverage(arr);
        System.out.println("The average of all elements in the array is: " + average);
    }

    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
