//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverse(first);
        
        
        second = reverse(second);
        
        Node ans = add(newFirst, newSecond);
        //System.out.println("ans.data : " + ans.data);
        ans = reverse(ans);
        return ans;
    }
    
    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    
    static Node add(Node first, Node second) {
        
        
        int carry = 0;
        Node ansHead = null;
        Node ansTail = null;
        
        while(first != null || second != null || carry != 0) {
        int val1 =0;
        if(first != null)
            val1 = first.data;
            
        int val2 =0;
        if(second != null)
            val2 = second.data;
            
        int sum = val1+val2+carry;
        
        int digit = sum%10;
        carry = sum/10;
        // insertAtTail
        Node newNode = new Node(digit);
        if (ansHead == null) {
        ansHead = newNode;
        ansTail = newNode;
      } else {
        ansTail.next = newNode;
        ansTail = newNode;
      }
        
        if(first != null)
            first = first.next;
            
        if(second != null)
            second = second.next;
        }
        
        return ansHead;
    }
}
