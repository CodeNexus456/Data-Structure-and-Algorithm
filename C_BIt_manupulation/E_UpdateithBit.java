package C_BIt_manupulation;

public class E_UpdateithBit {
  public static int SetithBit(int n , int i){
    int bitmask = i<<1;
    return n | bitmask;
  }

      public static int ClearithBit(int n, int i) {
       int bitmask = ~(1<<i);
       return n & bitmask;

    } 

    public static int UpdateIthBit(int n , int i, int newBit) {
      // if(newBit == 0) {
      //   return ClearithBit(n, i);
      // } else {
      //   return  SetithBit(n, i);
      // }

      // or 

      n = ClearithBit(n, i);
      int bitMask = newBit<<i;
      return n | bitMask;
    }
    public static void main(String[] args) {
      System.out.println(UpdateIthBit(10, 2, 1));
    }
}
