package String;

public class KstringCompression {
  public static String Compress(String str) {
    String subStr = "";

    for(int i=0; i<str.length(); i++) {
      Integer count = 1;
      while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
        count++;
        i++;
      }
      subStr += str.charAt(i);
      if(count > 1) {
        subStr += count.toString();
      }
    }
    return subStr;
  }
  public static void main(String[]args) {
    String str = "aaabbccccddddd";
    System.out.println(Compress(str));
  }
}
