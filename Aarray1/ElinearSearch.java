package Aarray1;
public class ElinearSearch {

  public static int LinearSearch(int number[],int key){
    for(int i=0; i<number.length; i++) {
      if(number[i] == key) {
        return i;
      } 
      }
      return -1;
    }
  
  
  public static void main(String[]args){
    int number[] = {10,20,30,40};
    int key = 500;
    int index = LinearSearch(number,key);

    if( index == -1) {
      System.out.println("not found");
    } else {
        System.out.println("Key is at index : " + index );
    }
  }
}
