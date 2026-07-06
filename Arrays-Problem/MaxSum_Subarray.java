public class MaxSum_Subarray{
 
  public static void subarrayBruteForce(int[] arr, int n) {
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < n; i++){
      for(int j = i; j < n; j++){
        int sum = 0;
        for(int k = i; k <= j; k++){
          sum += arr[k];
          System.out.print(arr[k] + " ");
          max = Math.max(max, sum);
        }
        System.out.println();
      }
      System.out.println();
    }
    System.out.println(max);
  }
  
  public static void main(String[] args) {
    // int[] arr1 = {0, 1};
        // int[] arr2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] arr3 = {3, 0, 1};
        // int[][] arrays = {arr1, arr2, arr3};
        // int t = arrays.length;
        subarrayBruteForce(arr3, arr3.length);
        // for (int i = 0; i < t; i++) {
        //     subarrayBruteForce(arrays[i], arrays[i].length);
        //     // print
        //     // System.out.println(arr);
        // }
  }
}