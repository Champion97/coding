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
    int len = 0;
    LinkedList temp = head;
    while(temp != null) {
      len++;
      temp = temp.next;
    }
    LinkedList midNode = head;
    for(int i = 0; i<len/2; i++) {
      midNode = midNode.next;
    }
    return midNode;
  }
}

