public class StringQuestion{
  public static String reverseString(String str){
    int low = 0, high = str.length() - 1;
    StringBuilder sb = new StringBuilder();
    while(low < high){
      String temp = String.valueOf(str.charAt(low));
      sb.insert(low, String.valueOf(str.charAt(high)));
      sb.insert(high, temp);
      low++;
      high--;
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    System.out.println(reverseString("Vaibhav"));
  }
}