package D_Recurssion;

public class K_OptimizePower {
  public static int OptimizePower(int a, int n) { // O(log(n))
    // base case 
    if(n == 0) {
      return 1;
    }
    int halfPower = OptimizePower(a, n/2);
    int halfPowerSq = halfPower * halfPower;
    // if odd case

    if(n % 2 != 0) {
      halfPowerSq = a * halfPowerSq;
    }
    return halfPowerSq;
  }
  public static void main(String[] args) {
    System.out.println(OptimizePower(2, 4));
  }
}
