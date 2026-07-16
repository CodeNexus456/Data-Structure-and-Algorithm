package Practice;

public class SortedArray {
  // Check if array is sorted
  public static int SortedArray(int number[]) {
    for(int i=0; i<number.length; i++) {
      int curr = number[i];
      for(int j=i+1; j<number.length; j++) {
        int old = number[j];
        if (number[i] > number[j] || number[i] > number[j]) {
          return 1;
        } 
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int number[] = {2,1,4,6,3,7};
    SortedArray(number);
  }
}
