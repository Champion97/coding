//https://www.codingninjas.com/studio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2


import java.util.*;

class Program {
  public static int[] searchForRange(int[] array, int target) {
    // Write your code here.
    int n = array.length;
    int s = 0;
    int e = n -1;
    int mid = (s+e)/2;

    int leftmost = findLeftMost(array, s, e, mid, target);
    int rightmost = findRightMost(array, s, e, mid, target);
    
    return new int[] {leftmost, rightmost};
  }
  public static int findLeftMost(int[] arr, int s, int e, int mid, int target) {
    int ans = -1;
    while(s <= e) {
      if(arr[mid] == target) {
        ans = mid;
        e = mid -1;
      } else if(arr[mid] < target) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
      mid = (s + e) / 2;
    }
    return ans;
  }
  public static int findRightMost(int[] arr, int s, int e, int mid, int target) {
   int ans = -1;
    while(s <= e) {
      if(arr[mid] == target) {
        ans = mid;
        s = mid + 1;
      } else if(arr[mid] < target) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
      mid = (s + e) / 2;
    }
    return ans;
  }
}

