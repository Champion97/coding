//https://www.algoexpert.io/questions/insertion-sort

import java.util.*;

class Program {
  public static int[] insertionSort(int[] array) {
    // Write your code here.
    int n = array.length;
    for(int i = 0; i < n; i++) {
      int temp = array[i];
      int j = i -1;
      for(; j >=0; j--) {
        if(array[j] > temp) {
          array[j+1] = array[j];
        } else {
          break;
        }
      }
      array[j+1] = temp;
    }
    return array;
  }
}

