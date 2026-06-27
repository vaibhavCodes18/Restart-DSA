import java.util.*;
public class ArraysProblem {

  public static int largestElement(int[] arr) {
    int n = arr.length;

    // Arrays.sort(arr);
    // return arr[n-1];

    int max = arr[0];
    for(int i = 0; i < n; i++){
      if(arr[i] >= max){
        max = arr[i];
      }
    }
    return max;
  }

  public static int secondLargest(int[] arr){
    Arrays.sort(arr);
    return arr[arr.length - 2];
  }

  public static void main(String[] args) {
    
    int[] arr1 = {1, 2, 3, 8, 8, 1, 5, 6, 5, 6};
    int[] arr2 = {13, 2, 23, 8, 84};
    int[] arr3 = {-1, -23, -3, -82, 0, 1};
    int[][] arrays = {arr1,arr2,arr3};
    int t = arrays.length;

    for(int i = 0; i < t; i++){
      int res = secondLargest(arrays[i]);
      System.out.println(res);
    }
  }
}