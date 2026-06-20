

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

  public static void fullInvertedPyramid(int n){
    for(int i = n-1; i >= 0; i--){
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

  public static void binaryHalfPyramid(int n){
    int start;
    for(int i = 0; i < n; i++){
      if(i%2==0) start = 1;
      else start = 0;
      for(int j = 0; j <= i; j++){
        System.out.print(start);
        start = 1 - start;
      }
      System.out.println();
    }
  }

  public static void pattern12(int n){
    int space = 2*n-1;
    for(int i = 1; i <= n; i++){
      // numbers
      for(int j = 1; j <= i; j++){
        System.out.print(j);
      }
      // space
      for(int j = 1; j <= space; j++){
        System.out.print(" ");
      }
      // numbers
      for(int j = i; j >= 1; j--){
        System.out.print(j);
      }
      System.out.println();
      space -= 2;
    }
  }

  public static void pattern13(int n){
    int count = 1;
    for(int i = 1; i <= n; i++){
      for(int j = i; j >= 1; j--){
        System.out.print(count);
        count++;
      }
      System.out.println();
    }
  } 

  public static void pattern14(int n){
    for(int i = 1; i <= n; i++){
      char ch = 'A';
      for(int j = 1; j <= i; j++){
        System.out.print(ch+" ");
        ch++;
      }
      System.out.println();
    }
  }

  public static void pattern15(int n){
    for(int i = 1; i <= n; i++){
      char ch = 'A';
      for(int j = 1; j <= n-i+1; j++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }

  public static void pattern16(int n){
    char ch = 'A';
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(ch);
      }
      System.out.println();
      ch++;
    }
  }

  public static void pattern17(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n-i+1; j++){
        System.out.print(" ");
      }
      char ch = 'A';
      for(int j = 1; j <= i; j++){
        System.out.print(ch);
        ch++;
      }
      ch--;
      for(int j = 2; j <= i; j++){
        ch--;
        System.out.print(ch);
      }
      System.out.println();
    }
  }

  public static void pattern18(int n){
    for(int i = 0; i < n; i++){
      for(char ch = (char)('E'-i) ; ch <= 'E'; ch++){
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // int t = 3;
    // int n = 3;
    // for(int i = 0; i < t; i++){
    //   pattern12(n);
    //   n++;
    // }
    pattern18(5);
  }

}