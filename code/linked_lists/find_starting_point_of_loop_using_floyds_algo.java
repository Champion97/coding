//https://www.algoexpert.io/questions/find-loop

import java.util.*;

class Program {
  public static LinkedList findLoop(LinkedList head) {
    // Write your code here.
    LinkedList intersection = findIntersection(head);
    if(intersection == null)
      return null;
    LinkedList slow = head;
    while(slow != intersection) {
      slow = slow.next;
      intersection = intersection.next;
    }
    return slow;
  }

  public static LinkedList findIntersection(LinkedList head) {
    LinkedList slow = head;
    LinkedList fast = head;

    while(fast != null && slow != null){
      fast = fast.next;
      if(fast != null) {
        fast = fast.next;
      }
      slow = slow.next;
      if(fast == slow)
        return slow;
    }
    return null;
  }
  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}

