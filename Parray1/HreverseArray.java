package Parray1;

public class HreverseArray {
  public static int ReverseNumber(int number[]) {
    int start = 0;
    int n = number.length;
    int end = n-1 ;

    while (start<end) {

      int temp = number[end];
      number[end] = number[start];
      number[start] = temp;
      end--;
      start++;
    }

    return -1;
  }
public static void main(String[]args) {
  int number[] = {1,2,3,5,6,7,8};
  ReverseNumber(number);

  // print number

  for(int i=0; i<number.length; i++ ) {
    System.out.print(number[i] + " ");
  }
  System.out.println();
}

}