

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
  
  public static void main(String[] args) {
    int n = 4;
    printNums(1,n);
  }

}
