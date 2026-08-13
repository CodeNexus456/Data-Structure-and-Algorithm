// package Array2D;

// intoduction of Array

public class Abasic {
  public static void main(String[]args) {
    int arr[][] = {
      {20,49,78},
      {67,83,93},
      {83,72,83}
    };

    // traversing a Array

    for(int i=0; i<arr.length; i++) {
      for(int j=0; j<arr[i].length; j++) {

        System.out.print(arr[i] [j] + " ");
      }
      System.out.println();
    }
  }
}
