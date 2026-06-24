// package HashingTechniques;
import java.util.*;

public class Hashing {

  public static void countFrequency(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();

    for(int i:arr){
      // if(map.get(i) != null){

      //   map.put(i, map.get(i) + 1);
      // }else{
      //   map.put(i, 1);
      // }

      // or else we have another options that is getOrDefault(K,V) with set default value at the time of get element if key not exist
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    System.out.println(map);
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3,8, 1, 5, 6,5,6};
    countFrequency(arr);
  }
}
