//https://www.algoexpert.io/questions/selection-sort

import java.util.*;

class Program {
  public static int[] selectionSort(int[] array) {
    // Write your code here.
    int n = array.length;

    for(int i = 0; i<n -1; i++) {
      int minidx = i;
      for(int j = i+1; j < n; j++) {
        if(array[j] < array[minidx]) {
          minidx = j;
        }
      }
      swap(array, i, minidx);
    }
    return array;
  }
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

