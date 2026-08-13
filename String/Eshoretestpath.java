package String;

public class Eshoretestpath {
  public static float ShortestDistance(String path) {
    int x = 0, y = 0;
    for(int i=0; i<path.length(); i++) {
      char dir = path.charAt(i);
      // East
      if(dir == 'E') {
        x++;
      } else if (dir == 'W') {
        y--;
      } else if (dir == 'N') {
        y++;
      } else {
        y--;
      }
    }

    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
  }

  public static void main(String[] args) {
    String path = "WNEENESENNN";
    System.out.println(ShortestDistance(path));
  }
}
