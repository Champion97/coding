//https://leetcode.com/problems/reverse-words-in-a-string/submissions/

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();
      //  int trailingSpaces = s.length() - s.trim().length();
        for(int i = words.length - 1; i >=0; i--) {
            // if(trailingSpaces != 0) {
            //     reverse.append(" ".repeat(trailingSpaces));
            // }
            reverse.append(words[i]);
            if(i > 0) {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
}
