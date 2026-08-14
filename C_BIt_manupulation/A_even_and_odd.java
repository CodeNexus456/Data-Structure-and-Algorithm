package C_BIt_manupulation;

public class A_even_and_odd {
  public static void OddOrEven(int n) {
    int bitMask = 1;
    if((n & bitMask) == 0) {
      // even

      System.out.println("number is even");
    } else {
      // odd
      System.out.println("Number is odd");
    }
  }
  public static void main(String[]args) {
    
    OddOrEven(3);
    OddOrEven(6);
    OddOrEven(9);
  }
}
