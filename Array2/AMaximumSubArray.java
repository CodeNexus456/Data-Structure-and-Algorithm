package Array2;

// Maximum subarray sum by brute force

public class AMaximumSubArray {
  public static void MaximumSubArraySum(int number[]) {
    int total = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i=0; i<number.length; i++) {
      int start = i;
      for(int j=i+1; j<number.length; j++) {
        int end = j;
        int currSum = 0;
        for(int k=start; k<=end; k++) {
          currSum+=number[k];
        }
        System.out.println(currSum);
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max Sum : " + maxSum);
  }
  public static void main(String[]args) {
    int number[] = {2,4,6,8,10};
    MaximumSubArraySum(number);
  }
}
