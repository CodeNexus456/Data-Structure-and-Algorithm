package Parray;

import java.util.*;

public class Dfunction {
  public static void array(int marks[]) {
    for(int i=0; i<marks.length; i++) {
      marks[i] = marks[i] + 1;
    }
  }
  public static void main(String[]atgs) {
    int marks[] = {1,3,4,6,7};
    array(marks);
    
    // print marks of Array

    for(int i=0; i<marks.length; i++) {
      System.out.print(marks[i] + " ");
    }
    System.out.println();
  }
}
