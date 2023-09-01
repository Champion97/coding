//https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1

/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head == null)
        return;
        Node intersection = findInt(head);
        if(intersection == null)
        return;
        Node startOfLoop = findStart(head, intersection);
        removeLoop(startOfLoop, head);
        
    }
    
    public static Node findInt(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && slow != null) {
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
    
    public static Node findStart(Node head, Node intersection) {
        if(head == null)
        return null;
        Node slow = head;
        Node inter = intersection;
        while(slow != inter) {
        slow = slow.next;
        inter = inter.next;
        }
        return slow;
        
    }
    public static void removeLoop(Node startOfLoop, Node head) {
        Node temp = startOfLoop;   //VIMP line -> dont use temp = head, it should be temp = startOfLoop
        while(temp.next != startOfLoop){
            temp = temp.next;
        }
        temp.next = null;
    }
}
