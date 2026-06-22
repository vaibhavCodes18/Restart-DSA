

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
  
  public static void main(String[] args) {
    int n = 4;
    printNumsRev(1,n);
  }

}
