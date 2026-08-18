package D_Recurssion;

// Sum fo Natural number Function
//  f(n) = n + f(n - 1)

public class E_SumOfNnaturalnum {
  public static int calcuSum(int n) {
    // base case 
    if(n == 1) {
      return 1;
    }
    // recursive case 
    int Snm1 = calcuSum(n-1);
    int Sn = n + Snm1;
    return Sn;
  }

  public static void main(String[]args) {
    int n = 100;
    System.out.println(calcuSum(n));
  }
}
