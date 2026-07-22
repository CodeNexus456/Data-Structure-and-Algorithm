package Array2;

// maximum sub Array sum by prefix sum method
  public class BMaximumSubArray {
  public static void MaximumSubArraySum(int number[]) {
    int total = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[number.length];

    prefix[0] = number[0];
    // calculate prefix Array 

    for(int i=1; i<prefix.length; i++) {
      prefix[i] = prefix[i-1] + number[i];
    }

    for(int i=0; i<number.length; i++) {
      int start = i;
      for(int j=i+1; j<number.length; j++) {
        int end = j;
        int currSum = 0;
       
        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
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


