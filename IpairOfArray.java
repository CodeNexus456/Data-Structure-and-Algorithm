import java.util.*;

public class IpairOfArray {
  public static void PairOfArray(int number[]) {
    int totalPair = 0;
    int sum = 0;
    for (int i = 0; i < number.length; i++) {
      int curr = number[i];

      for (int j = i + 1; j < number.length; j++) {
        System.out.print("(" + curr + "," + number[j] + ")");
        System.out.print(" = " + (number[i] + number[j]) + ",");
        
        totalPair++;
        sum++;
      }
      System.out.println();
      System.out.println();
    }

    System.out.println("Total pair : " + totalPair);
  }

  public static void main(String[] args) {
    int number[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    PairOfArray(number);
  }
}