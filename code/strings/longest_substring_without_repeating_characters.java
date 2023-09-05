//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        int resStart = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(end < n) {
            if(map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end) )+ 1);
            }
            map.put(s.charAt(end), end);
            if(maxLen < end - start + 1) {
                maxLen = end - start + 1;
                resStart = start;
            }
            end++;
        }
        //return s.substring(resStart, resStart+maxLen).length(); 
        return maxLen;
    }
}
