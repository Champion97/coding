//https://www.codingninjas.com/studio/problems/reverse-list-in-k-groups_983644?leftPanelTab=0%3Fsource%3Dyoutube&campaign=Lovebabbar_codestudio_26thjan&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar_codestudio_26thjan

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static int size(Node head) {
        if(head == null) {
            return 0;
        }
        if(head.next == null) {
            return 1;
        }
        int len = 0;
        Node temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
    public static Node kReverse(Node head, int k) {
        // Write your code here.
          if(head == null) {
            return null;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;

        int count = 0;

        while(curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null && size(next) >= k) {
        head.next = kReverse(next, k);
        } else {
            head.next = next;
        }
        return prev;
    }
    }

