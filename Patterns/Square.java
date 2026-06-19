

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

  public static void main(String[] args) {
    numberPyramid(4);
  }

}