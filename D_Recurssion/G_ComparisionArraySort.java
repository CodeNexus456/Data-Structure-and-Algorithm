package D_Recurssion;


//  if arr[i] > arr[i+1]
//        ↓
//     false

// otherwise
//        ↓
// check next element recursively


public class G_ComparisionArraySort {
  public static boolean SortedArray(int arr[], int i) {
    if( i == arr.length-1){
      return true;
    }

    if(arr[i] > arr[i+1]) {
      return false;
    }
    return SortedArray(arr, i+1);
  }
  public static void main(String[]args) {
    int arr[] = {1,2,6,4,5};
    System.out.println(SortedArray(arr,0));
  }

}
