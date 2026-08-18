package D_Recurssion;

import Practice.revesrseArray;

public class D_Factorial {
  public static int Factorial(int n) {
    // base case 
   if(n == 0) {
    return 1;
   }
    // recursive case 
    int fnm1 = Factorial(n - 1);
    int fn = n * Factorial(n-1);
    return fn;
  }
  
  public static void main(String[]args) {
    int n = 5;
    System.out.println(Factorial(n));
  }
}
