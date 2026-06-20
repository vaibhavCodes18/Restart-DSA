

public class Square{

  public static void square(int n){
    for (int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++){
          System.out.print("* ");
        }
        System.out.println();
    }
  }

  public static void pyramid(int n){
    for (int i = 0; i < n; i++) {
        for(int j = 0; j < i+1; j++){
          System.out.print("* ");
        }
        System.out.println();
    }
  }

  public static void numberPyramid(int n){
    for (int i = 0; i < n; i++) {
      int count = 1;
        for(int j = 0; j < i+1; j++){
          System.out.print(count + " ");
          count++;
        }
        System.out.println();
    }
  }

  public static void numberPyramid2(int n){
    int count = 1;
    for(int i = 0; i < n; i++){
      for(int j = 0; j <= i; j++){
        System.out.print(count+" ");
      }
      count++;
      System.out.println();
    }
  }

  public static void invertedPyramid(int n){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n-i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void invertedNumberPyramid(int n){
    for(int i = 0; i < n; i++){
      int count = 1;
      for(int j = 0; j < n-i;j++){
        System.out.print(count + " ");
        count++;
      }
      System.out.println();
    }
  }

  public static void fullPyramid(int n){
    for(int i = 0; i < n; i++){
      // space
      for(int j = 0; j < n-i; j++){
        System.out.print(" ");
      }

      // star "*"
      for(int j = 0; j < 2*i+1; j++){
        System.out.print("*" );
      }
      System.out.println();
    }
  }


  public static void main(String[] args) {
    int t = 3;
    int n = 3;
    for(int i = 0; i < t; i++){
      fullPyramid(n);
      n++;
    }
    
  }

}