/*13. Find the index of first occurrence of a specific element in an array. */
public class PracticeQno13 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        int target = 8;
        int index = findIndex(arr, target);
        if (index != -1) {
            System.out.println("The index of the first occurrence of " + target + " is: " + index);
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
