//https://www.algoexpert.io/questions/bubble-sort

import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
    // Write your code here.
    int n = array.length;
    boolean swapped = false;
    for(int i = 0; i < n-1; i++) {
      for(int j = 0; j < n-i-1; j++) {
        if(array[j] > array[j+1])
          swap(array, j, j+1);
          swapped = true;
      }
      if(swapped == false) {
        break;
      }
    }
    return array;
  }
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
 }

