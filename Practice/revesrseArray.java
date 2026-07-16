package Practice;

public class revesrseArray {
  public static int Revesse(int number[]) {
    int start = 0;
    int n = number.length;
    int end = n-1;

    while (start<=end) {
      int temp = number[end];
      number[end] = number[start];
      number[start] = temp;
      start++;
      end--;
    }
    return -1;
  }
  public static void main(String[]args) {
    int number[] = {1,2,3,4,5,6};
    Revesse(number);
  // print number 
  for(int i=0; i<number.length; i++ ) {
    System.out.print( number[i] + " ");
  }
  System.out.println();
  }
}
