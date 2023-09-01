import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList middleNode(LinkedList head) {
    // Write your code here.
    if(head == null || head.next == null) {
      return head;
    }
    if(head.next.next == null) {
      return head.next;
    }
    LinkedList fast = head.next;
    LinkedList slow = head;

    while(fast != null) {
      fast = fast.next;
      if(fast != null) {
        fast = fast.next;
      }
      slow = slow.next;
    }
    return slow;
  }
}

