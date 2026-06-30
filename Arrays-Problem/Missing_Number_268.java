
import java.util.Arrays;

public class Missing_Number_268 {

    public static int missingNumber(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1};
        int[] arr2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] arr3 = {3, 0, 1};
        int[][] arrays = {arr1, arr2, arr3};
        int t = arrays.length;

        for (int i = 0; i < t; i++) {
            int arr = missingNumber(arrays[i], arrays[i].length);
            // print
            System.out.println(arr);
        }
    }
}
