//https://www.algoexpert.io/questions/staircase-traversal

import java.util.*;

class Program {
  public int staircaseTraversal(int height, int maxSteps) {
    // Write your code here.
    if(height == 0) {
      return 1;
    }
    int ways = 0;
    for(int step = 1; step <= maxSteps && step <= height; step++) {
      ways = ways + staircaseTraversal(height - step, maxSteps);
    }
    return ways;
  }
}

