package Aarray1;
import java.util.*;;

public class FlargestNumber {
  public static int LargestNumber(int number[]) {
    int largest = Integer.MIN_VALUE;
    int Smallest = Integer.MAX_VALUE;

    for (int i = 0; i < number.length; i++) {
      if (largest < number[i]) {
        largest = number[i];
      }

      if (Smallest > number[i]) {
        Smallest = number[i];
      }
    }
    System.out.println("Smallest value : " + Smallest);
    return largest;
  }

  public static void main(String[] args) {
    int number[] = { 1, 3, 5, 7, 8 };

    System.out.println("Largest Number is " + LargestNumber(number));
  }
}