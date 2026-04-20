/* 2. Find the average of an array elements. */

public class PracticeQno2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        System.out.println("The average of elements in the array is: " + average);
    }
}


