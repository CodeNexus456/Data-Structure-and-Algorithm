package Bstring;

public class Gsubstring {
  // substring

  public static String SubString(String str, int start, int end) {
     String  substr = "";
    for(int i=start ; i<end; i++) {
      substr += str.charAt(i);
    }
      return substr;
  }
  public static void main(String[]args) {
    String str = "Apnacollege";
    System.out.println(SubString(str, 2, 5));
  }
}
