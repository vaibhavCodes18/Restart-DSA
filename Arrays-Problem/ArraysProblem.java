import java.util.*;

public class ArraysProblem {

  public static void printArray(int[] arr, int n){
    for(int j = 0; j < n; j++){
        System.out.print(arr[j] + " ");
    }
  }

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
    // int largest = arr[0];
    // int slargest = -1;
    // for(int i = 0; i < n; i++){
    //   if(arr[i] >= largest){
    //     largest = arr[i];
    //   }
    // }

    // for(int i = 0; i < n; i++){
    //   if(arr[i] > slargest && arr[i] != largest){
    //     slargest = arr[i];
    //   }
    // }

    // optimal
    int largest = arr[0];
    int slargest = -1;
    for(int i = 0; i < n; i++){
      if(arr[i] > largest){
        slargest = largest;
        largest = arr[i];
      }else if(arr[i] < largest && arr[i] > slargest){
        slargest = arr[i];
      }
    }

    return slargest;    
  }

  public static boolean isSorted(int[] arr) {
    for(int i = 1; i < arr.length; i++){
      if(arr[i] >= arr[i-1]){}
      else return false;
    }
    return true;
  }

  public static void removeDuplicated(int[] arr) {
    Set<Integer> set = new TreeSet<>();
    for(int i = 0; i < arr.length; i++){
      set.add(arr[i]);
    }
    // int set.stream().mapToInt(Integer::intValue).toArray();
  }

  public static int removeDuplicated(int[] arr, int n) {
    int i = 0;
    for(int j = 1; j < n; j++){
      if(arr[i] != arr[j]){
        i++;
        arr[i] = arr[j];
      }
    }
    return i + 1;
    
  }

  public static void leftRotationByOne(int[] arr, int n){
    int temp = arr[0];
    for(int i = 1; i < n; i++){
      arr[i-1] = arr[i];
    }
    arr[n-1] = temp;
  }


  public static void main(String[] args) {
    
    int[] arr1 = {1, 2, 3, 4, 5, 6};
    int[] arr2 = {13,2, 2, 23, 8, 84};
    int[] arr3 = {-1, -23, -3, -82, 0, 1};
    int[][] arrays = {arr1,arr2,arr3};
    int t = arrays.length;

    for(int i = 0; i < t; i++){
      leftRotationByOne(arrays[i], arrays[i].length);
      // print
      printArray(arrays[i], arrays[i].length);
      System.out.println();
    }
  }
}