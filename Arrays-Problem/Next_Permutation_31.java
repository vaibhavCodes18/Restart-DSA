public class Next_Permutation_31 {

  public static void reverseArray(int[] arr, int low, int high) {
    while(low<high){
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;
    }
  }

  public static int[] nextPermutation(int[] arr, int n) {
    int pivot = -1;
    for(int i = n-2; i>=0; i--){
      if(arr[i] < arr[i+1]){
        pivot = i;
        break;
      }
    }
    if(pivot == -1) {
      reverseArray(arr, 0, n-1);
      return arr;
    }

    for(int i = n-1; i > pivot; i--){
      if(arr[pivot] < arr[i]){
        int temp = arr[pivot];
        arr[pivot] = arr[i];
        arr[i] = temp;
        break;
      }
    }
    reverseArray(arr, pivot+1, n-1);

    return arr;
  }

  public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,2,1};
        int[] arr3 = {1,1,5};
        int[][] arrays = {arr1, arr2, arr3};
        int t = arrays.length;

        for (int i = 0; i < t; i++) {
            int[] arr = nextPermutation(arrays[i], arrays[i].length);
            // print
            for(int j = 0;j < arr.length; j++){
              System.out.print(arr[j] +" ");
            }
            System.out.println();
        }
  }
}
