package D_Recurssion;

public class J_PowerOfNumber {
  public static int PowerOfNumber(int x, int n) {
    // base case 
    if(n == 0) {
      return 1;
    }
    // recurssive case
    int pnm1 = PowerOfNumber(x, n - 1);
    int pn = x * pnm1;
    return pn;
  }
  public static void main(String[]args) {
    System.out.println(PowerOfNumber(7, 2));
  }
}
