import java.util.HashSet;
import java.util.Set;

public class Duplicate_Number_287 {

  public static int duplicateElementBruteForce(int[] arr, int n) {
    for(int i = 0; i < n; i++){
      int num = arr[i];
      for(int j = 0; j < n; j++){
        if(i != j && num == arr[j]) return num;
      }
    }
    return -1;
  }

  public static int duplicateElementBetterForce(int[] arr, int n) {
    Set<Integer> s = new HashSet<>();
    for(int i : arr){
      if(s.contains(i)) return i;
      s.add(i);
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr1 = {1,3,4,2,2};
        int[] arr2 = {3,2,3};
        int[] arr3 = {3,1,3,4,2};
        int[][] arrays = {arr1, arr2, arr3};
        int t = arrays.length;

        for (int i = 0; i < t; i++) {
            int arr = duplicateElementBetterForce(arrays[i], arrays[i].length);
            // print
            System.out.println(arr);
        }
  }
}
