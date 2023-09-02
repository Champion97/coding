//https://www.algoexpert.io/questions/merge-linked-lists

import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    int value;
    LinkedList next;

    LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public static LinkedList mergeLinkedLists(
    LinkedList headOne, LinkedList headTwo
  ) {
    LinkedList ans = null;
    // Write your code here.
    if(headOne == null)
      return headTwo;
    if(headTwo == null)
      return headOne;

    if(headOne.value < headTwo.value)
     ans = sort(headOne, headTwo);
    else 
     ans = sort(headTwo, headOne);
    return ans;
  }

  public static LinkedList sort(LinkedList headOne, LinkedList headTwo) {
    LinkedList curr1 = headOne;
    LinkedList curr2 = headTwo;
    LinkedList next1 = headOne.next;
    LinkedList next2 = headTwo.next;

    if(next1 == null) {
      curr1.next = curr2;
      return headOne;
    }
    while(curr2 != null && next1 != null) {
      if((curr2.value <= next1.value) && (curr2.value >= curr1.value)) {
        curr1.next = curr2;
        next2 = curr2.next;
        curr2.next = next1;

        curr1 = curr2;
        curr2 = next2;
      }
      else {
        curr1 = next1;
        next1 = next1.next;

        if(next1 == null) {
          curr1.next = curr2;
          return headOne;
        }
      }
    }
    return headOne;
  }
}

