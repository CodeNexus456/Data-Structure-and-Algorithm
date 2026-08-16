package C_BIt_manupulation;

public class I_isPowerofNumber {
  public static boolean isPoweofTwo(int n) {
    return (n&(n-1)) == 0;
  }
  public static void main(String[]args) {
    System.out.println(isPoweofTwo(8));
  }
}
