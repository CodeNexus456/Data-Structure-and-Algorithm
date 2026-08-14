package Bstring;

public class Dpelindrom {
  public static boolean isPelindrom(String str) {
    for(int i=0; i<str.length()/2; i++) {
      int n = str.length();
      if(str.charAt(i) != str.charAt(n-1-i)) {
      return false;
      } 
    }

    return true;
  }
  public static void main(String[]args) {
    String str = "121";
    System.out.println(isPelindrom(str));
  }
}

// or


// String  str = "121";
    // String reverse =  "";
    //  for(int i=str.length()-1; i>=0; i--) {
    //   reverse = reverse + str.charAt(i);
    //  }

    //  if(str.equals(reverse) ) {
    //   System.out.println("Pelindrom");
    //  } else {
    //   System.out.println("Not Pelindrom");
    //  }