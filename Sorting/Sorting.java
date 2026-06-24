

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

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 8, 1, 5, 6, 5, 6};
    selectionSort(arr);
    printArray(arr);
  }
  
}
