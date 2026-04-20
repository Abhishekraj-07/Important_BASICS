/*11. Merge two arrays into a third array. */
public class PracticeQno11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] mergedArr = mergeArrays(arr1, arr2);

        System.out.println("Merged array:");
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            mergedArr[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArr[index++] = arr2[i];
        }

        return mergedArr;
    }
}