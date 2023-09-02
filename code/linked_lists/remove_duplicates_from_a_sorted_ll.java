//https://www.algoexpert.io/questions/remove-duplicates-from-linked-list --sorted linkedlist 

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

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
    LinkedList currNode = linkedList;
    while(currNode != null) {
      LinkedList nextNode = currNode.next;
      while(nextNode != null && currNode.value == nextNode.value) {
        nextNode = nextNode.next;
      }
      currNode.next = nextNode;
      currNode = nextNode;
    }
    return linkedList;
  }
}



+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

LOVE BABBAR METHOD - O(n) and O(1)

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

  public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
    LinkedList currNode = linkedList;
    while(currNode != null) {
      LinkedList nextNode = currNode.next;
      if(nextNode != null && currNode.value == nextNode.value) {
        LinkedList next_nextNode = nextNode.next;
        currNode.next = next_nextNode;
      }
      else {
        currNode = currNode.next;
      }
    }
    return linkedList;
  }
}


//for an unsorted linked list,
3 possible solutions
- Use 2 loops - keep one element at the beginning and check the rest of the LL for same element. If found, delete it. - O(n^2) 
- Sort the linked list and then remove duplicates - O(nlogn)
- Use a map of Node and Boolean type and if map entry is true, then remove it from the LL - O(n) time and O(n) space
