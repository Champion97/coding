20  Detect and Remove Loop in a Linked List
Given a singly linked list, you have to detect the loop and remove the loop from the linked list, if present. You have to make changes in the given linked list itself and return the updated linked list.
Expected Complexity: Try doing it in O(n) time complexity and O(1) space complexity. Here, n is the number of nodes in the linked list.
Problem approach
We are going to maintain a lookup table(a Hashmap) that basically tells if we have already visited a node or not during the course of traversal.
