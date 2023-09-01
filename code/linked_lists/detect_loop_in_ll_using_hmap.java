//https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        HashMap<ListNode, Boolean> visited = new HashMap<ListNode, Boolean>();

        while(temp != null) {
            if(visited.get(temp)!= null && visited.get(temp)) {
                return true;
            }
            visited.put(temp, true);
            temp = temp.next;
        }
        return false;
     }
}
