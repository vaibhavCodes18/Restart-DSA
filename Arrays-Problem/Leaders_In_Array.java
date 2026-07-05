
import java.util.ArrayList;
import java.util.Collections;

public class Leaders_In_Array{

  public static ArrayList<Integer> leadersInArrayBruteForce(int[] arr, int n){
    ArrayList<Integer> al = new ArrayList<>();
    for(int i = 0; i < n; i++){
      boolean leader = true;
      for(int j = i+1; j < n; j++){
        if(arr[j] >= arr[i]){
          leader = false;
          break;
        }
      }
      if(leader) al.add(arr[i]);
    }
    return al;
  }

  public static ArrayList<Integer> leadersInArrayOptimal(int[] arr, int n){
    ArrayList<Integer> al = new ArrayList<>();
    int max = Integer.MIN_VALUE;
    for(int i = n-1; i >= 0; i--){
      if(arr[i] > max){
        al.add(arr[i]);
        max = arr[i];
      }
    }
    Collections.reverse(al);
    return al;
  }

  public static void main(String[] args) {
        int[] arr1 = {6, 7, 4, 2, 5, 3};
        int[] arr2 = {3,2,3};
        int[] arr3 = {3,1,3,4,2};
        int[][] arrays = {arr1, arr2, arr3};
        int t = arrays.length;

        for (int i = 0; i < t; i++) {
            ArrayList<Integer> arr = leadersInArrayBruteForce(arrays[i], arrays[i].length);
            // print
            System.out.println(arr);
        }
  }
}