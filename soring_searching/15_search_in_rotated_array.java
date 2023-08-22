//https://www.codingninjas.com/studio/problems/search-in-rotated-sorted-array_1082554?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2

import java.util.*;

class Program {
  public static int shiftedBinarySearch(int[] array, int target) {
    // Write your code here.
    int n = array.length;
    int pivot = findPivot(array, n);
    if(target >= array[pivot] && target <= array[n -1]) {
      return binarySearch(array, pivot, n-1, n, target);
    } else {
      return binarySearch(array, 0, pivot -1, n, target);
    }
    
  }
  public static int findPivot(int[] arr, int n) {
    int s = 0;
    int e = n -1;
    int mid = (s + e) /2;

    while(s < e) {
      if( arr[mid] >= arr[0]) {
        s = mid + 1;
      } else {
        e = mid;
      }
      mid = (s + e) /2;
    }
    return s;
  }

  public static int binarySearch(int arr[], int start, int end, int n, int x) {
    int s = start;
    int e = end;
     int mid = (s + e) / 2;
    while(s <= e) {
      if(arr[mid] == x) {
        return mid;
      } else if(arr[mid] > x) {
        e = mid -1;
      } else {
        s = mid + 1;
      }
      mid = (s + e)/2;
    }
    return -1;
  }
}

