public class CountDigits {

  // brute force approach
  public static int countDigits(int num) {
    int count = 0;

    while(num > 0){
      count++;
      num /= 10;
    }

    return count;
  }
  
  // brute force approach
  public static int countDigitsOptimize(int num) {
    return (int)(Math.log10(num)+1);
  }

  public static void main(String[] args) {
    int result = countDigitsOptimize(125);
    System.out.println(result);
  }
}
