import java.util.ArrayList;
import java.util.List;

public class Sorting {

  public static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]+ " ");
    }
  }


  public static void selectionSort(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n-1; i++){
      int min = i;
      for(int j = i; j < n; j++){
        if(arr[j] < arr[min]){
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }

  public static void bubbleSort(int[] arr){
    int n = arr.length;
    for(int i = n-1; i >= 1; i--){
      int didSwap = 0;
      for(int j = 0; j <= i-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          didSwap = 1;
        }
      }
      if(didSwap == 0) break;
    }
  }

  public static void insertionSort(int[] arr){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      int j = i;
      while(j > 0 && arr[j-1] > arr[j]){
        int temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;
        j--;
      }
    }
  }

  public static void mergeSort(int[] arr, int low, int high) {
    if(low==high) return;
    int mid = (low+high)/2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid+1, high);
    merge(arr, low, mid, high);
  }

  public static void merge(int[] arr, int low, int mid, int high) {
    List<Integer> temp = new ArrayList<>();
    int left = low, right = mid+1;
    while(left <= mid && right <= high){
      if(arr[left] <= arr[right]){
        temp.add(arr[left]);
        left++;
      }
      else{
        temp.add(arr[right]);
        right++;
      }
    }
    while(left <= mid){
      temp.add(arr[left]);
      left++;
    }
    while(right <= high){
      temp.add(arr[right]);
      right++;
    }
    for(int i = low; i <= high; i++){
      arr[i] = temp.get(i-low);
    }
  }

  public static int partition(int[] arr, int low, int high){
    int pivot = arr[low];
    int i = low;
    int j = high;
    while(i < j){
      while(arr[i] <= pivot && i <= high-1){
        i++;
      }
      while(arr[j] >= pivot && j >= low+1){
        j--;
      }
      if(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    return j;
  }

  public static void qs(int[] arr, int low, int high) {
    if(low < high){
      int pIndex = partition(arr, low, high);
      qs(arr, low, pIndex - 1);
      qs(arr, pIndex + 1, high);
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 8, 1, 5, 6, 5, 6};
    qs(arr, 0, arr.length-1);
    printArray(arr);
  }
  
}
