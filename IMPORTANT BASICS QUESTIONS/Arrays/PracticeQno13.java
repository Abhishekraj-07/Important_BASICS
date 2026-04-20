/*13. Find the sum of all elements in an array. */
public class PracticeQno13 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        int sum = findSum(arr);
        System.out.println("The sum of all elements in the array is: " + sum);
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
