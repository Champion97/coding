bool isCircular(Node head) {
//empty list is circular
if(head == NULL) {
return true;
}
Node temp = head.next;
while(temp != null && temp != head)
{
temp = temp.next;
}
if(temp == head)
return true;

return false;

}

//alteernate method would be to maintain a map with value : visited or not
If already visited, then it is circular.
Time O(n) and space O(n)
