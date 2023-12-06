Populating Next Right Pointers In Each Node
You have been given a complete binary tree of ‘N’ nodes. The nodes are numbered 1 to ‘N’.
You need to find the ‘next’ node that is immediately right in the level order form for each node in the given tree.
Note :
1. A complete binary tree is a binary tree in which nodes at all levels except the last level have two children and nodes at the last level have 0 children.
2. Node ‘U’ is said to be the next node of ‘V’ if and only if  ‘U’ is just next to ‘V’ in tree representation.
3. Particularly root node and rightmost nodes have ‘next’ node equal to ‘Null’ 
4. Each node of the binary tree has three-pointers, ‘left’, ‘right’, and ‘next’. Here ‘left’ and ‘right’ are the children of node and ‘next’ is one extra pointer that we need to update.
For Example :

The‘next’ node for ‘1’ is ‘Null’, ‘2’ has ‘next’ node ‘6’, ‘5’ has ‘next’ node ‘3’, For the rest of the nodes check below.

Problem approach
The idea here is to perform BFS while maintaining all nodes of the same level together, which can be done by storing nodes of the same level in a queue data structure, then for a particular level, we start popping nodes one by one and set the ‘next’ pointer of the previously popped node to the current node.
