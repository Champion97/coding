//https://www.algoexpert.io/questions/remove-kth-node-from-end

import java.util.*;

class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
    // Write your code here.
    LinkedList fast = head;
    LinkedList slow = head;
    int count = 0;
    while(count < k) {
      fast = fast.next;
      count++;
    }
    if(fast == null) {
      head.value = head.next.value;
      head.next = head.next.next;
      return;
    }

    while(fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }
    slow.next = slow.next.next;
    return;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}

