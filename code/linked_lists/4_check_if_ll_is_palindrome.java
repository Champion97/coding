//https://www.algoexpert.io/questions/linked-list-palindrome

//approach 1 : convert LL to array and check if array is pallindrome - O(n) time and O(n) space
//to get constant space complexity, 1. find middle of LL 2. reverse 2nd half of LL 3. compare both halves of the LL 4. repeat 2nd step.(optional step)

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

  public boolean linkedListPalindrome(LinkedList head) {
    // Write your code here.
    if(head.next == null)
      return true;
    LinkedList mid = findMid(head);
    LinkedList temp = mid.next;
    mid.next = reverse(temp);

    LinkedList headOne = head;
    LinkedList headTwo = mid.next;

    while(headTwo != null) {
      if(headOne.value != headTwo.value) 
        return false;
      headOne = headOne.next;
      headTwo = headTwo.next;
    }
    reverse(mid.next);
    return true;
  }

  public LinkedList findMid(LinkedList head) {
    LinkedList fast = head.next;
    LinkedList slow = head;
    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      
      slow = slow.next;
    }
    return slow;
  }

  public LinkedList reverse(LinkedList head) {
    LinkedList prev = null;
    LinkedList next = null;
    LinkedList curr = head;

    while(curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }
}

