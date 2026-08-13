package String;

public class basic {
  public static void main(String[]args) {

    // String are immutable 

    String str = "Apnacollege";
    String str1 = "Hello";
    String str2 = "Apnacollege";
    System.out.println(str.charAt(4));
    System.out.println(str.length());
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.equals(str2));
    
    String fullname = str.concat(" " + str1);
    System.out.println(fullname);
    System.out.println(str.substring(2,6));

    // traversing 

    for(int i=0; i<str.length(); i++) {
      System.out.println(str.charAt(i));
    }
  }
}
