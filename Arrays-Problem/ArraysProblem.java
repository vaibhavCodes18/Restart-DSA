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
    int n = arr.length;

    // Brute force
    // Arrays.sort(arr);

    // int largest = arr[n - 1];
    // for(int i = n - 2; i >= 0; i--){
    //   if(largest != arr[i]) {
    //     largest = arr[i];
    //     break;
    //   }
    // }

    // Better
    int largest = arr[0];
    int slargest = -1;
    for(int i = 0; i < n; i++){
      if(arr[i] >= largest){
        largest = arr[i];
      }
    }

    for(int i = 0; i < n; i++){
      if(arr[i] > slargest && arr[i] != largest){
        slargest = arr[i];
      }
    }

    return slargest;    
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