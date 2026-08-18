
// What is Fibonacci?

// The Fibonacci sequence is a sequence of numbers where each number is the sum of the previous two numbers.


// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

// F(n) = F(n-1) + F(n-2)

// F(0) = 0
// F(1) = 1

// 0 + 1 = 1
// 1 + 1 = 2
// 1 + 2 = 3
// 2 + 3 = 5
// 3 + 5 = 8
// 5 + 8 = 13

  //             fib(4)
  //            /      \
  //        fib(3)     fib(2)
  //        /   \       /   \
  //    fib(2) fib(1) fib(1) fib(0)
  //     /  \
  // fib(1) fib(0)


//   | Complexity | Recursive Fibonacci |
// | ---------- | ------------------- |
// | **Time**   | **O(2^n)**          |
// | **Space**  | **O(n)**            |



package D_Recurssion;

public class F_fibonacci {
  public static int Fibonacci(int n) {
    if(n == 1 || n == 0) {
      return n;
    } 
    // Recursive case 
  int fnm1 = Fibonacci(n-1);  // 1st recurssion call 
  int fnm2 = Fibonacci(n-2); // 2nd recurssion call
  int fn = fnm1 + fnm2;
  return fn;
  }
  public static void main(String[]args) {
    int n = 22;
    System.out.println(Fibonacci(n));
    System.out.println(Fibonacci(23));
    System.out.println(Fibonacci(24));
    System.out.println(Fibonacci(25));
    System.out.println(Fibonacci(26));
    System.out.println(Fibonacci(27));
    System.out.println(Fibonacci(28));
    System.out.println(Fibonacci(29));
  }
}
