/* 22. Count frequency of each element. */
public class PracticeQno22 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 8, 8, 8, 5};
        int maxVal = 8; // Assuming the maximum value in the array is 8
        countUsingArray(arr, maxVal);
    }

   public static void countUsingArray(int[] arr, int maxVal) {
    int[] freq = new int[maxVal + 1];
    
    for (int num : arr) {
        freq[num]++;
    }
    
    for (int i = 0; i < freq.length; i++) {
        if (freq[i] > 0) {
            System.out.println(i + " occurs " + freq[i] + " times.");
        }
    }
}
}
