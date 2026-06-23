

public class Recursion {

  public static void printNames(int i, int n) {
    if(i > n) return;
    System.out.println("Vaibhav");
    printNames(i+1, n);
  }

  public static void printNums(int i, int n) {
    if(i > n) return;
    System.out.println(i);
    printNums(i+1, n);
  }

  public static void printNumsRev(int i, int n) {
    if(i > n) return;
    System.out.println(n);
    printNumsRev(i, n-1);
  }
  
  public static int sumOfNumbersParameterizd(int sum, int n) {
    if(n < 1) return sum;
    return sumOfNumbersParameterizd(sum+n,n-1);
  }

  public static int sumOfNumbersFuntional(int n) {
    if(n == 0) return 0;
    return n + sumOfNumbersFuntional(n-1);
  }

  public static int factOfNumbersFuntional(int n) {
    if(n == 1) return 1;
    return n * factOfNumbersFuntional(n-1);
  }

  public static int factOfNumbersParameterizd(int n, int fact) {
    if(n == 1) return fact;
    return factOfNumbersParameterizd(n-1, fact*n);
  }

  public static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]+ " ");
    }
  }

  public static void reverseArray(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while(end > start){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      end--;
      start++;
    }
    printArray(arr);
  }

  public static void reverseArrayRecursion(int i, int n, int arr[]) {
    if(i >= n/2) return;
    int temp = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = temp;
    reverseArrayRecursion(i+1, n, arr);
  }

  public static boolean isPalinfrome(int i, String str) {
    int n = str.length();
    if(i >= n/2) return true;
    if(str.charAt(i) != str.charAt(n-i-1)) return false;
    return isPalinfrome(i+1,str);
  }

  public static void main(String[] args) {
    // int sum = 0, n = 5;
    String str = "MADAM";
    System.out.println(isPalinfrome(0,  str));
  }

}
