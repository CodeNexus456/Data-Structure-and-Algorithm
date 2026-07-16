package Practice;

public class LargestNumber {
  public static int LargestNumbers(int number[]) {
    int largest = Integer.MIN_VALUE;
    int Smallest = Integer.MAX_VALUE;

    for(int i=0; i<number.length; i++) {
      if(largest < number[i]) {
        largest = number[i];
      }  

      if(Smallest > number[i]) {
        Smallest = number[i];
      }
    }
    System.out.println("Smallest Number in Araay is : " + Smallest);
    return largest;
  }
  public static void main(String[]args){
    int number[] = {1,2,3,4,5,6};

    System.out.println("Largest Number in Array : " + LargestNumbers(number));
  }
}
