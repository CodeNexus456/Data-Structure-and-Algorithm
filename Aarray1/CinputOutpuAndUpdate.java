package Aarray1;
import java.util.*;

public class CinputOutpuAndUpdate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = a + b;
    // System.out.println("Sum of two number is : " + c);

    // taking input Array
    int marks[] = new int[100];

    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println("marks of phy :" + marks[0]);
    System.out.println("marks of chem :" + marks[1]);
    System.out.println("marks of math :" + marks[2]);

    // updation

    // marks[1] = 33;
    // System.out.println("updated marks of chem :" + marks[1]);6
    

    int percentage = (marks[0] + marks[1] + marks[2]) / 3;

    System.out.println("Percentage of marks is : " + percentage + "%");
    System.out.println("length of an Array is : " + marks.length);
  }
}
