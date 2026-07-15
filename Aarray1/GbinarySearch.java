package Aarray1;
import java.util.*;

public class GbinarySearch {
  public static int BinarySearch(int number[], int key) {

    int start = 0;
    int n = number.length;
    int end = n - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (number[mid] == key) {
        return mid;
      }
      if (number[mid] < key) { // right
        start = mid + 1;
      } else { // left
        end = mid - 1;
      }

    }
    return -1;
  }

  public static void main(String[] args) {
    int number[] = { 1, 3, 4, 7, 8, 9, 11 };
    int key = 9;
    System.out.println("index of searching key " + BinarySearch(number, key));
  }
}