//https://leetcode.com/problems/reverse-string/submissions/

class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length -1;
        while(start <= end) {
            //swap(start, end, s);
            char temp = s[start];
             s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public void swap(int st, int e, char[] s) {
        char temp = s[st];
        s[st] = s[e];
        s[e] = temp;
    }
}
