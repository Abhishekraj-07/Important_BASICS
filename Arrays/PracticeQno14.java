/*14. Find the last occurrence of a specific element in an array. */
public class PracticeQno14 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        int target = 8;
        int lastIndex = findLastIndex(arr, target);
        if (lastIndex != -1) {
            System.out.println("The index of the last occurrence of " + target + " is: " + lastIndex);
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }

    public static int findLastIndex(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
