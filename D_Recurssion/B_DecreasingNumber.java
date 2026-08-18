package D_Recurssion;

// Decreasing Number 

public class B_DecreasingNumber {
  // public static void DecreasingNumber() {
  //   for(int i=10; i>=1; i--) {
  //     System.out.println(i);
  //   }
  // }
  // public static void main(String[]args) {
  //   DecreasingNumber();
  // }


  // or 

  public static void DecreasingFunction(int n) {
    // base case 
    if(n == 1) {
      System.out.println(n);
      return;
    }

    // recurssion case 
    System.out.print(n + " ");
    DecreasingFunction(n-1);
  }


  public static void main(String[] args) {
    int n = 10;
    DecreasingFunction(n);
  }
}
