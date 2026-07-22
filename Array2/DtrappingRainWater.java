package Array2;

public class DtrappingRainWater {
  public static int TrappingRainWaterProblem(int height[]) {
    int n = height.length;
    // Calculate left max boundray - Array
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i=1; i<n; i++) {
    leftMax[i] = Math.max(height[i],leftMax[i-1]);
    
  }
    
    // Calculate right max boundray - Array

    int rightmax[] = new int[n];
    rightmax[n-1] = height[n-1];
    for(int i=n-2; i>=0; i--) {
      rightmax[i] = Math.max(height[i] , rightmax[i+1]);
    }
    // loop
    int trappedWater = 0;

    for(int i=0; i<n; i++) {
      // waterLevel = min(leftmax boundary , rightmax boundry)
      int waterLevel = Math.min(rightmax[i], leftMax[i]);
          // trapped water = waterLevel - height[i]
      trappedWater += waterLevel - height[i];
    }

    return trappedWater;
  }

  public static void main(String[] args) {
    int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(TrappingRainWaterProblem(height));
  }
}
