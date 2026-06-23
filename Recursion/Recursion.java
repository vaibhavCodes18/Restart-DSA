

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

  public static void main(String[] args) {
    // int sum = 0, n = 5;
    int[] arr = {12, 34, 5, 6, 4, 7};
    reverseArray(arr);
  }

}
