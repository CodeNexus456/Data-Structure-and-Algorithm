package C_BIt_manupulation;

public class C_SetithBit {
  public static int SetithBit(int n , int i){
    int bitmask = i<<1;
    return n | bitmask;
  }
  public static void mian(String[]args) {
    SetithBit(3, 8);
  } 
}