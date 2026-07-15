package Aarray1;
public class JSubArray {
  public static void SubArray(int number[]) {
    // int SubArraySum = 0;
    int totalSubArray = 0;
    for(int i=0; i<number.length; i++) {
      int start = i;
      for(int j=i+1; j<number.length; j++) {
        int end = j;
        for(int k=start; k<end; k++) {

          System.out.print(number[k] + " ");
          // System.out.println("Sum of Sub Array is :" + number[k] + number[j]);
          totalSubArray++;
          // SubArraySum++;
        }
        System.out.println();
      }
      System.out.println();
    }

    // System.out.println("Total number of Sub Array : " + totalSubArray);
  }
  public static void main(String[]args) {
    int number[] = {1,2,3,4,5,6,7};
    SubArray(number);
  }
}
