import java.util.*;

class Program {
  public static LinkedList reverseLinkedList(LinkedList head) {
    // Write your code here.
    return reverse(head);
  }

  static LinkedList reverse(LinkedList head) {
    if(head == null || head.next == null) {
      return head;
    }

    LinkedList chotaHead = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return chotaHead;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}

