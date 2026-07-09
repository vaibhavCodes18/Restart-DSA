
public class Best_Time_Buy_Sell121{

  public static int bestTimeToBuySell(int[] prices, int n) {
    int mp = 0;
    int bb = prices[0];
    for(int i = 1; i < n; i++){
      if(prices[i] > bb){
        mp = Math.max(mp, prices[i] - bb);
      }
      bb = Math.min(bb, prices[i]);
    }
    return mp;
  }

  public static void main(String[] args) {
        int[] arr1 = {7,1,5,3,6,4};
        int[] arr2 = {7,6,4,3,1};
        int[] arr3 = {3,1,3,4,2};
        int[][] arrays = {arr1, arr2, arr3};
        int t = arrays.length;

        for (int i = 0; i < t; i++) {
            int arr = bestTimeToBuySell(arrays[i], arrays[i].length);
            // print
            System.out.println(arr);
        }
  }
}