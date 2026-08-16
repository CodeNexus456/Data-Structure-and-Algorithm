package C_BIt_manupulation;

public class G_ClearRangeBit {
  public static int ClearRangeOfBit(int n , int i, int j) {
    int a = ((~0)<<(j+1));
    int b = (1<<i)-1;
    int bitMask = a | b;
    return n & bitMask;
  }

  public static void main(String[]args) {
    System.out.println(ClearRangeOfBit(10, 1, 1));
  }
}
