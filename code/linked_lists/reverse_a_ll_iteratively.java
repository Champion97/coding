import java.util.*;

class Program {
  public static LinkedList reverseLinkedList(LinkedList head) {
    // Write your code here.
    LinkedList prev = null;
    LinkedList curr = head;

    //O(n) time and O(1) space complexity
    if(head == null || head.next == null) {
      return head;
    }
    while(curr != null) {
      LinkedList forward = curr.next;
      curr.next = prev;
      prev = curr;
      curr = forward;
    }
    return prev;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}

