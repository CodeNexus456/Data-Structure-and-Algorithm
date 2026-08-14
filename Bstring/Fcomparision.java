package Bstring;

public class Fcomparision {
  public static void main(String[]args) {
    String str = "Suraj";
    String str2 = "Suraj";
    String str3 = new String("Suraj");

    if(str == str2) {
      System.out.println("String are equal");
    } else {
      System.out.println("String are not equal");
    }

     if(str2 == str3) {
      System.out.println("String are equal");
    } else {
      System.out.println("String are not equal");
    }

     if(str3 == str) {
      System.out.println("String are equal");
    } else {
      System.out.println("String are not equal");
    }
  }
}
