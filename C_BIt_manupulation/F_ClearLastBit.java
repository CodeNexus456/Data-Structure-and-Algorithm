package C_BIt_manupulation;

public class F_ClearLastBit {
  public static int clearLstBit(int n, int i) {
    int bitmask = (~0)<<i;
    return n & bitmask;
  }

  public static void main(String[]args) {
    System.out.println(clearLstBit(17, 2));
  }
}
