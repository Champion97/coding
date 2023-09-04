//https://www.algoexpert.io/questions/shift-linked-list

import java.util.*;

class Program {
  public static LinkedList shiftLinkedList(LinkedList head, int k) {
    // Write your code here.
    LinkedList listTail = head;
    int len = 1;

    while(listTail.next != null) {
      listTail = listTail.next;
      len++;
    }

    int offset = Math.abs(k) % len;
    if(offset == 0) return head;
    int newTailPosn = (k>0) ? len - offset : offset;
    LinkedList newTail = head;
    for(int i = 1; i < newTailPosn; i++) {
      newTail = newTail.next;
    }
    LinkedList newHead = newTail.next;
    newTail.next = null;
    listTail.next = head;
    return newHead;
  }

  static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      next = null;
    }
  }
}

