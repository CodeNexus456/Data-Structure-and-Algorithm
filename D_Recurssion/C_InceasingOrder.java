package D_Recurssion;

public class C_InceasingOrder {
   public static void DecreasingFunction(int n) {
    // base case 
    if(n == 1) {
      System.out.print(n  + " ");
      return;
    }

    // recurssion case 
    DecreasingFunction(n-1);
    System.out.print(n + " ");
  }


  public static void main(String[] args) {
    int n = 10;
    DecreasingFunction(n);
  }
}
