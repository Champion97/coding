//https://www.algoexpert.io/questions/binary-search

import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
    int n = array.length;
    int s = 0;
    int e = n -1;
    int mid = (s+e)/2;
    while(s <= e) {
      if(array[mid] == target) {
        return mid;
      } else if(array[mid] > target) {
        e = mid -1;
      } else {
        s = mid + 1;
      }
      mid = (s+e)/2;
    }
    return -1;
  }
}

