import java.util.*;

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

  public static int reverseNumber(int n) {
    if(n==0) return 0;
      int rev = 0;
      while(n > 0){
        int lastDigit = n % 10;
        rev = rev*10 + lastDigit;
        n /= 10;
      }
      return rev;
  }

  public static boolean palindrome(int n) {
      int dup = n;
		  int rev = 0;
		  while(n>0){
        int ld = n % 10;
        n /= 10;
        rev = rev*10 + ld;
		  }
		return dup == rev;
  }

  public static boolean amstrong(int n) {
    int duplicate = n;
    int sum = 0;
    while(n>0){
      int ld = n % 10;
      sum += (ld*ld*ld);
      n/=10;
    }
    return sum == duplicate;
  }

  public static void printAllDivisors(int n) {
    for(int i = 1; i <= n; i++){
      if(n % i == 0){
        System.out.println(i);
      }
    }
  }

  // brute force approach
  public static int countDigitsOptimize(int num) {
    return (int)(Math.log10(num)+1);
  }

  public static void printAllDivisors2(int n) {
    List<Integer> list = new ArrayList<>();
    for(int i = 1; i <= (int)Math.sqrt(n); i++){
      if(n % i == 0){
        list.add(i);
        if(n/i != i){
          list.add(n/i);
        }
      }
    }
    list.sort(null);
    System.out.println(list);
  }

  public static boolean prime(int n) {
    int count = 0;
    for(int i = 1; i*i <= n; i++){
      if(n%i==0){
        count++;
        if(n/i != i){
          count++;
        }
      }
    }
    if(count == 2) return true;
    return false;
  }

  public static void main(String[] args) {
    boolean result = prime(36);
    System.out.println(result);
  }
}
