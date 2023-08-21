//https://www.algoexpert.io/questions/index-equals-value

import java.util.*;

class Program {
  public int indexEqualsValue(int[] array) {
    // Write your code here.
    int n = array.length;
    int s = 0;
    int e = n -1;
    int mid = (s+e)/2;
    int ans = -1;
    while(s <= e) {
      if(array[mid] == mid) {
        ans = mid;
        e = mid -1;
      } else if(array[mid] > mid) {
        e = mid -1;
      } else {
        s = mid + 1;
      }
      mid = (s + e) /2;
    }
    return ans;
  }
}

