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


  // brute force approach
  public static int countDigitsOptimize(int num) {
    return (int)(Math.log10(num)+1);
  }

  public static void main(String[] args) {
    boolean result = amstrong(1634);
    System.out.println(result);
  }
}
