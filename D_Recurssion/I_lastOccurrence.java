package D_Recurssion;

public class I_lastOccurrence {
  public static int lastOccurrence(int arr[], int key, int i) {
    if(i == arr.length) {
      return -1;
    }
   int isFound = lastOccurrence(arr,key,i + 1);
   if(isFound == -1 && arr[i] == key) {
    return i;
   }

   return isFound;
  }
  public static void main(String[] args) {
    int arr[] = {5,5,1,3,4,6,7,8,5,9,0,5};
    System.out.println(lastOccurrence(arr, 5, 0));
  }

}
