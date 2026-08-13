package Sorting;

public class Bselection {
  public static void SelectionSort(int arr[]) {
    int max = 0;

    for(int i=0; i<arr.length; i++) {
      if(max < arr[i]) {
        max = max + arr[i];
      }
    }
    
  }
  public static void main(String[]args){
    int arr[] = {40,20,10,50,70,30};

  }
}
